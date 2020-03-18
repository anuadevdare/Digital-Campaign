package com.digital.campaign.dao.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital.campaign.dao.CampaignDao;
import com.digital.campaign.dao.repository.CampaignRepository;
import com.digital.campaign.dto.CampaignDto;
import com.digital.campaign.entity.Campaign;
import com.digital.campaign.entity.Question;
import com.digital.campaign.entity.Response;
/**
 * The CampaignDaoImpl responsible to create the campaign for multiple questions and their
 * possible answers for the particular company.
 */
@Service
public class CampaignDaoImpl implements CampaignDao {

	@Autowired
	CampaignRepository campaignRepository;

	@Override
	public void createCampign(CampaignDto campaignDto) {
		CampaignImpl campaignImpl = new CampaignImpl();
		Campaign campaign = campaignImpl.dtoToEntityConvert(campaignDto);
		for (Question question : campaign.getQuestionList()) {
			campaign.addQuestion(question);
			for (Response response : question.getResponseList()) {
				question.addResponse(response);
			}
		}
		campaign.setStatus("Init");
		campaign.setCreatedDate(new Date());
		campaign.setCreatedBy(System.getProperty("user.name"));
		campaignRepository.save(campaign);
	}
}
