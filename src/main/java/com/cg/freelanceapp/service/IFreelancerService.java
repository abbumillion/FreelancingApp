package com.cg.freelanceapp.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.FreelancerDTO;
import com.cg.freelanceapp.dto.FreelancerListDTO;
import com.cg.freelanceapp.entities.Freelancer;

/**************************************************************************************
 * Author thomas
 * Description : This is the Service Interface for Freelancer module.
 *  jun 16 2022
 * Version     : v1.0.0
 *************************************************************************************/
//@Service
public interface IFreelancerService {

	Freelancer findById(Long id);

	Long getCurrentId();

	Freelancer save(FreelancerDTO freelancerDto);

	Freelancer update(@Valid Long id, FreelancerDTO freelancerDto);

	Freelancer findByUserName(String userName);
	
	List<FreelancerListDTO> listFreelancers();
}
