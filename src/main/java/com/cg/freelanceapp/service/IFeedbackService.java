package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.FeedbackDTO;
import com.cg.freelanceapp.dto.FeedbackListDTO;
import com.cg.freelanceapp.entities.Feedback;

/**************************************************************************************
 * Author thomas
 * Description : This is the Service Interface for feedback module.
 *  jun 16 2022
 * Version     : v1.0.0
 *************************************************************************************/
public interface IFeedbackService {

	Float averageRating(String id);

	Feedback addFeedback(FeedbackDTO feedbackDto);

	List<FeedbackListDTO> findFeedbacksForFreelancerByRecruiter(String fId, String rId);
}
