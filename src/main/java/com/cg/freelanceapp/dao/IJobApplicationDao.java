package com.cg.freelanceapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.dto.JobApplicationsListDTO;
import com.cg.freelanceapp.entities.JobApplication;

@Repository
public interface IJobApplicationDao extends JpaRepository<JobApplication, Long> {
	
	@Query("select new com.cg.freelanceapp.dto.JobApplicationsListDTO(j.id, j.job.id, j.job.jobTitle, j.coverLetter, bf.id, CONCAT(bf.freelancer.firstName,' ', bf.freelancer.lastName), bf.freelancer.userName)  from JobApplication j, Freelancer f, BookmarkedFreelancer bf where j.job.id=:jobId and j.freelancer.id = bf.freelancer.id order by j.job.id")
	List<JobApplicationsListDTO> findAllByJobId(@Param("jobId") Long jobId);
	
	@Query("select new com.cg.freelanceapp.dto.JobApplicationsListDTO(j.id, j.job.id, j.job.jobTitle, j.coverLetter, f.id, CONCAT(f.firstName,' ', f.lastName), f.userName)  from JobApplication j, Freelancer f where j.freelancer = f order by j.id")
	List<JobApplicationsListDTO> findAllApps();
}
