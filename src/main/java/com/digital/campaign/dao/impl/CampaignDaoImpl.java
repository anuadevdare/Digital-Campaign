package com.digital.campaign.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital.campaign.dao.CampaignDao;
import com.digital.campaign.dao.repository.CampaignRepository;
import com.digital.campaign.dto.CampaignDto;
import com.digital.campaign.dto.FilterParams;
import com.digital.campaign.entity.Answer;
import com.digital.campaign.entity.Campaign;
import com.digital.campaign.entity.Question;
import com.digital.campaign.exception.CampaingnAlreadyStartedException;
import com.digital.campaign.utility.DateConverter;

/**
 * The CampaignDaoImpl has implemented to create the campaign for multiple
 * questions and their possible answers for the particular company,Display list
 * of all campaign,get campaign by id,if campaign is not started then campaign
 * can delete or update
 */
@Service
public class CampaignDaoImpl implements CampaignDao {

	@Autowired
	CampaignRepository campaignRepository;

	CampaignImpl campaignImpl = new CampaignImpl();

	@Override
	public void createCampign(CampaignDto campaignDto) {
		Campaign campaign = campaignImpl.convertDtoToEntity(campaignDto);
		for (Question question : campaign.getQuestionList()) {
			campaign.addQuestion(question);
			for (Answer response : question.getResponseList()) {
				question.addResponse(response);
			}
		}
		campaign.setStatus("Init");
		campaign.setCreatedDate(new Date());
		campaign.setCreatedBy(System.getProperty("user.name"));
		campaignRepository.save(campaign);
	}

	@Override
	public CampaignDto getCampaignByCampaignId(long campaignId) {
		Campaign campaign = campaignRepository.findById(campaignId).get();
		if (campaign == null) {
			throw new EntityNotFoundException(campaignId + " is invalid campaign Id.Please,Enter valid campaign Id");
		}
		return campaignImpl.convertEntityToDto(campaign);
	}

	@Override
	public List<CampaignDto> getCampaignList() {
		List<CampaignDto> campainDtoList = new ArrayList<>();
		for (Campaign campaign : campaignRepository.findAll()) {
			campainDtoList.add(campaignImpl.convertEntityToDto(campaign));
		}
		return campainDtoList;
	}

	@Override
	public void deleteByCampignId(long campaignId) {
		isCampignStarted(campaignId, "delete");
		campaignRepository.deleteById(campaignId);
	}

	private void isCampignStarted(long campaignId, String operation) {
		String isStrared = campaignRepository.isInitState(campaignId);
		if (isStrared == null) {
			throw new EntityNotFoundException("Please enter valid campign Id to " + operation + "! ");
		} else if (!isStrared.equals("Init")) {
			throw new CampaingnAlreadyStartedException("Campaign already started, so you can't " + operation + " it! ");
		}

	}

	@Override
	public void updateCampaign(@Valid CampaignDto campaignDto) {
		Campaign campaign = campaignImpl.convertDtoToEntity(campaignDto);
		isCampignStarted(campaign.getCampaignId(), "update");
		for (Question question : campaign.getQuestionList()) {
			campaign.addQuestion(question);
			for (Answer response : question.getResponseList()) {
				question.addResponse(response);
			}
		}
		campaign.setStatus("Init");
		campaign.setCreatedDate(new Date());
		campaign.setCreatedBy(System.getProperty("user.name"));
		campaignRepository.save(campaign);
	}

	@Override
	public List<CampaignDto> campaignbyfilter(FilterParams filterParams) {
		List<Campaign> campaignList = new ArrayList<>();
		List<CampaignDto> campainDtoList = new ArrayList<>();
		String columnName = filterParams.getColumnName();
		String filterOprator = filterParams.getFilterOprator();
		String filterValue = filterParams.getFilterValue();
		if ((columnName.equalsIgnoreCase("Company Name")) && (filterOprator.equalsIgnoreCase("EqualTo")))
			campaignList = campaignRepository.findByCompanyId(Integer.parseInt(filterValue));
		else if (columnName.contains("Date")) {
			Date timestamp = DateConverter.getDateFromString(filterValue);

			if (filterOprator.equalsIgnoreCase("EqualTo")) {
				if (columnName.equalsIgnoreCase("Start Date")) {
					campaignList = campaignRepository.findByStartDate(timestamp);
				} else if (columnName.equalsIgnoreCase("End Date")) {
					campaignList = campaignRepository.findByEndDate(timestamp);
				} else if (columnName.equalsIgnoreCase("Created Date")) {
					campaignList = campaignRepository.findByCreatedDate(timestamp);
				}
			} else if ((filterOprator.equalsIgnoreCase("LessThanEqualTo")) && (columnName.contains("Start"))) {
				campaignList = campaignRepository.findByStartDateBefore(timestamp);
			}
		}
		for (Campaign campaign : campaignList) {
			campainDtoList.add(campaignImpl.convertEntityToDto(campaign));
		}
		return campainDtoList;
	}

}
