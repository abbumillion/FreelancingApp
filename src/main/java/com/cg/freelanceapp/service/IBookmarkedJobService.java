package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.BookmarkedJobDTO;
import com.cg.freelanceapp.dto.BookmarkedJobListDTO;
import com.cg.freelanceapp.entities.BookmarkedJob;


/**************************************************************************************
 * Author thomas
 * Description : This is the Service Interface for bookmarked job module.
 *  jun 16 2022
 * Version     : v1.0.0
 *************************************************************************************/
public interface IBookmarkedJobService {

	BookmarkedJob bookmarkJob(BookmarkedJobDTO bjd);

	List<BookmarkedJob> findBookmarkedJobsBySkillName(String name);

	BookmarkedJob findById(Long id);
	
	List<BookmarkedJobListDTO> findAllBookmarks(Long frId);

	Long getCurrentId();
	
	void remove(Long BId);

}
