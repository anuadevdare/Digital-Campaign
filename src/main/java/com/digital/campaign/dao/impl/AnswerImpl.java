package com.digital.campaign.dao.impl;

import org.springframework.stereotype.Component;

import com.digital.campaign.dao.DtoEntityConverter;
import com.digital.campaign.dto.AnswerDto;
import com.digital.campaign.entity.Answer;

/**
 * The AnswerDaoImpl class is responsible for converting AnswerDto to Answer and
 * vice versa.
 */
@Component
public class AnswerImpl implements DtoEntityConverter<AnswerDto, Answer> {
	/**
	 * used to convert AnswerDto to Answer
	 * 
	 * @param AnswerDto the DTO object
	 * @return Answer the entity object
	 * 
	 */
	@Override
	public Answer convertDtoToEntity(AnswerDto dto) {
		return new Answer(dto.getAnswerId(), dto.getAnswerText());
	}

	/**
	 * used to convert Answer to AnswerDto
	 * 
	 * @param Answer the entity object
	 * @return AnswerDto the DTO object
	 * 
	 */
	@Override
	public AnswerDto convertEntityToDto(Answer entity) {
		return new AnswerDto(entity.getResponseId(), entity.getAnswerText());
	}

}
