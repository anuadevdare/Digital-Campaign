package com.digital.campaign.dao.impl;

import org.springframework.stereotype.Component;

import com.digital.campaign.dao.DtoEntityConverter;
import com.digital.campaign.dto.ResponseDto;
import com.digital.campaign.entity.Response;
/**
 * The AnswerDaoImpl class is responsible for converting AnswerDto to Answer and
 * vice versa.
 */
@Component
public class ResponseImpl implements DtoEntityConverter<ResponseDto, Response> {
/**
 * used to convert AnswerDto to Answer
 * @param AnswerDto the DTO object
 * @return Answer the entity object
 * 
 */
	@Override
	public Response dtoToEntityConvert(ResponseDto dto) {
		return new Response(dto.getResponseId(),dto.getResponseOption());
		
	}
	/**
	 * used to convert Answer to AnswerDto
	 * @param Answer the entity object
	 * @return AnswerDto the DTO object
	 * 
	 */
	@Override
	public ResponseDto entityToDtoConvert(Response entity) {
		return new ResponseDto(entity.getResponseId(),entity.getResponseOption());
	}

}
