package com.digital.campaign.dao.impl;

import java.util.HashSet;
import java.util.Set;

import com.digital.campaign.dao.DtoEntityConverter;
import com.digital.campaign.dto.CampaignDto;
import com.digital.campaign.dto.QuestionDto;
import com.digital.campaign.entity.Campaign;
import com.digital.campaign.entity.Question;

/**
 * The CampaignImpl class is responsible for converting CampaignDto to Campaign
 * and vice versa.
 */
public class CampaignImpl implements DtoEntityConverter<CampaignDto, Campaign> {
	QuestionImpl questionDaoImpl = new QuestionImpl();

	/**
	 * used to convert CampaignDto to Campaign
	 * 
	 * @param CampaignDto the DTO object
	 * @return Campaign the entity object
	 */
	@Override
	public Campaign convertDtoToEntity(CampaignDto dto) {
		Campaign campaign = new Campaign(dto.getCampaignId(), dto.getName(), dto.getDescription(), dto.getStartDate(),
				dto.getEndDate(), dto.getCompanyId(), dto.getNoOfDevices());
		Set<Question> question = new HashSet<>();
		for (QuestionDto questionDto : dto.getQuestionList()) {
			Question quesEntity = questionDaoImpl.convertDtoToEntity(questionDto);
			question.add(quesEntity);
		}
		campaign.setQuestionList(question);
		return campaign;
	}

	@Override
	public CampaignDto convertEntityToDto(Campaign entity) {

		CampaignDto campaignDto = new CampaignDto(entity.getCampaignId(), entity.getName(), entity.getDescription(),
				entity.getStatus(), entity.getStartDate(), entity.getEndDate(), entity.getCompanyId(),
				entity.getNoOfDevices(), entity.getCreatedBy(), entity.getCreatedDate(), entity.getActualEndDate());
		Set<QuestionDto> questions = new HashSet<>();
		for (Question question : entity.getQuestionList()) {
			QuestionDto questionDto = questionDaoImpl.convertEntityToDto(question);
			questions.add(questionDto);
		}
		campaignDto.setQuestionList(questions);
		return campaignDto;
	}

}
