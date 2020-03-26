package com.digital.campaign.dao.impl;

import java.util.HashSet;
import java.util.Set;

import com.digital.campaign.dao.DtoEntityConverter;
import com.digital.campaign.dto.QuestionDto;
import com.digital.campaign.dto.AnswerDto;
import com.digital.campaign.entity.Question;
import com.digital.campaign.entity.Answer;

/**
 * The QuestionDaoImpl class is responsible for converting QuestionDto to
 * Question and vice versa.
 */

public class QuestionImpl implements DtoEntityConverter<QuestionDto, Question> {
	AnswerImpl responseDaoImpl = new AnswerImpl();

	/**
	 * used to convert QuestionDto to Question
	 * 
	 * @param QuestionDto the DTO object
	 * @return Question the entity object
	 * 
	 */
	@Override
	public Question convertDtoToEntity(QuestionDto dto) {
		Question entity = new Question(dto.getQuestionId(), dto.getQuestionText(), dto.getOptionType(),
				dto.getQuestionPosition());
		Set<Answer> answers = new HashSet<>();
		for (AnswerDto responseDto : dto.getResponseList()) {
			Answer response = responseDaoImpl.convertDtoToEntity(responseDto);
			answers.add(response);
		}
		entity.setResponseList(answers);
		return entity;
	}

	/**
	 * used to convert Question to QuestionDto
	 * 
	 * @param Question the entity object
	 * @return QuestionDto the DTO object
	 * 
	 */

	@Override
	public QuestionDto convertEntityToDto(Question entity) {
		QuestionDto questionDto = new QuestionDto(entity.getQuestionId(), entity.getQuestionText(),
				entity.getOptionType(), entity.getQuestionPosition());
		Set<AnswerDto> responseList = new HashSet<>();
		for (Answer response : entity.getResponseList()) {
			AnswerDto responseDto = responseDaoImpl.convertEntityToDto(response);
			responseList.add(responseDto);
		}
		questionDto.setResponseList(responseList);
		return questionDto;

	}

}
