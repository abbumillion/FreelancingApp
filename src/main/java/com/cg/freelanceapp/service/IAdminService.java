package com.cg.freelanceapp.service;


import com.cg.freelanceapp.dto.AdminDTO;
import com.cg.freelanceapp.entities.Admin;
import java.util.List;

/**************************************************************************************
 * Author thomas
 * Description : This is the Service Interface for Freelancer module.
 *  jun 9 2022
 * Version     : v1.0.0
 *************************************************************************************/

public interface IAdminService {
	Admin findById(Long id);

	Admin save(AdminDTO adminDto);

	Admin update(Long id, AdminDTO adminDto);
	
	Admin findByUserName(String userName);

	List<Admin> findAll();

}
