package com.cg.freelanceapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.freelanceapp.dao.IAdminDao;
import com.cg.freelanceapp.dto.AdminDTO;
import com.cg.freelanceapp.entities.Admin;
import com.cg.freelanceapp.exceptions.InvalidAdminException;
import com.cg.freelanceapp.service.IAdminService;

import java.util.List;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService {

	@Autowired
	IAdminDao adminDao;

	@Override
	public Admin findById(Long id) {
		if (adminDao.existsById(id)) {
			return adminDao.findById(id).get();
		} else {
			throw new InvalidAdminException();
		}
	}

	@Override
	public Admin save(AdminDTO adminDto) {
		Admin admin = new Admin();
		//--------------------------------------------------------------------------------------------------------------
		String userName = adminDto.getUserName();
		String firstName = adminDto.getFirstName();
		String lastName = adminDto.getLastName();
		String password = adminDto.getPassword();
		String email = adminDto.getEmailAddress();
		String phoneNumber = adminDto.getPhoneNumber();
		//--------------------------------------------------------------------------------------------------------------
		if (!(firstName == null || lastName == null || password == null || userName == null || email == null || phoneNumber == null)) {
			//----------------------------------------------------------------------------------------------------------
			admin.setUserName(userName);
			admin.setFirstName(firstName);
			admin.setLastName(lastName);
			admin.setPhoneNumber(phoneNumber);
			admin.setEmailAddress(email);
			admin.setPassword(password);
			//----------------------------------------------------------------------------------------------------------
			return adminDao.save(admin);
		} else
			//----------------------------------------------------------------------------------------------------------
			throw new InvalidAdminException();
		    //----------------------------------------------------------------------------------------------------------
	}

	@Override
	public Admin update(Long id, AdminDTO adminDto) {
		if (adminDao.existsById(id)) {
			//----------------------------------------------------------------------------------------------------------
			Admin admin = adminDao.findById(id).get();
			admin.setUserName(adminDto.getUserName());
			admin.setPassword(adminDto.getPassword());
			admin.setFirstName(adminDto.getFirstName());
			admin.setLastName(adminDto.getLastName());
			admin.setEmailAddress(adminDto.getEmailAddress());
			admin.setPhoneNumber(adminDto.getPhoneNumber());
			//----------------------------------------------------------------------------------------------------------
			return adminDao.save(admin);
		} else {
			//----------------------------------------------------------------------------------------------------------
			throw new InvalidAdminException();
			//----------------------------------------------------------------------------------------------------------
		}
	}
	@Override
	public Admin findByUserName(String userName) {
		if (adminDao.existsByUserName(userName)) {
			return adminDao.findByUserName(userName);
		} else {
			throw new InvalidAdminException();
		}
	}

	@Override
	public List<Admin> findAll() {
		return adminDao.findAll();
	}

}
