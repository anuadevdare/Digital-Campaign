package com.digital.campaign.dao.impl;

import java.util.HashSet;
import java.util.Set;

import com.digital.campaign.dao.DtoEntityConverter;
import com.digital.campaign.dto.QuestionDto;
import com.digital.campaign.dto.ResponseDto;
import com.digital.campaign.entity.Question;
import com.digital.campaign.entity.Response;

/**
 * The QuestionDaoImpl class is responsible for converting QuestionDto to
 * Question and vice versa.
 */

public class QuestionImpl implements DtoEntityConverter<QuestionDto, Question> {
	ResponseImpl responseDaoImpl = new ResponseImpl();

	/**
	 * used to convert QuestionDto to Question
	 * 
	 * @param QuestionDto the DTO object
	 * @return Question the entity object
	 * 
	 */
	@Override
	public Question dtoToEntityConvert(QuestionDto dto) {
		Question entity = new Question(dto.getQuestionText(), dto.getOptionType());
		Set<Response> answers = new HashSet<Response>();
		for (ResponseDto responseDto : dto.getResponseList()) {
			Response response = responseDaoImpl.dtoToEntityConvert(responseDto);
			answers.add(response);
		}
		entity.setResponseList(answers);
		return entity;
	}

	/**
	 * used to convert Question to QuestionDto
	 * 
	 * @param Question the  object
	 * @return QuestionDto the DTO object
	 * 
	 */

	@Override
	public QuestionDto entityToDtoConvert(Question entity) {
		QuestionDto questionDto=new QuestionDto(entity.getQuestionText(),entity.getOptionType());
	
		Set<ResponseDto> responseList = new HashSet<ResponseDto>();
		for (Response response : entity.getResponseList()) {
			ResponseDto responseDto=responseDaoImpl.entityToDtoConvert(response);
			responseList.add(responseDto);
		}
		questionDto.setResponseList(responseList);
		return questionDto;

	}

}
