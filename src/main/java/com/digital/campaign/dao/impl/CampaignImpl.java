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
	public Campaign dtoToEntityConvert(CampaignDto dto) {
		Campaign campaign = new Campaign(dto.getName(), dto.getDescription(), dto.getStartDate(), dto.getEndDate(),
				dto.getCompanyId(), dto.getNoOfDevices());
		Set<Question> question = new HashSet<Question>();
		for (QuestionDto questionDto : dto.getQuestionList()) {
			Question quesEntity = questionDaoImpl.dtoToEntityConvert(questionDto);
			question.add(quesEntity);
		}
		campaign.setQuestionList(question);
		return campaign;
	}

	@Override
	public CampaignDto entityToDtoConvert(Campaign entity) {

		return null;
	}

}
