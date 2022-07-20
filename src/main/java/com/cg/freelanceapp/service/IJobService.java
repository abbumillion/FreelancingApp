package com.cg.freelanceapp.service;

import java.util.List;
import com.cg.freelanceapp.dto.JobDTO;
import com.cg.freelanceapp.entities.Job;

/**************************************************************************************
 * Author million
 * Description : This is the Service Interface for job module.
 * Created Date: 1 jun, 2022
 * Version     : v1.0.0
 *************************************************************************************/

public interface IJobService {

	void close(Long id);

	Job findById(Long id);
	
	List<Object> findJobsBySkillName(String name);
	
	List<Object> findAll();
	
	List<Object> findAllActiveJobs();
	
	Job postJob(JobDTO jobDto);
	
	void awardJob(Long jobId, Long freelancerId);
}
