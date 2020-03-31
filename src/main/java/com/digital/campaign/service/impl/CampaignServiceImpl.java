package com.digital.campaign.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital.campaign.dao.CampaignDao;
import com.digital.campaign.dto.CampaignDto;
import com.digital.campaign.dto.FilterParams;
import com.digital.campaign.service.CampaignService;

/**
 * The CampaignServiceImpl has implemented to create the campaign for multiple questions
 * and their possible answers for the particular company,Display list of all
 * campaign,get campaign by id,if campaign is not started then campaign can
 * delete or update
 */
@Service
public class CampaignServiceImpl implements CampaignService {

	@Autowired
	CampaignDao campaignDao;

	@Override
	public void createCampaign(CampaignDto campaign) {
		campaignDao.createCampign(campaign);
	}

	@Override
	public CampaignDto getCampaignByCampaignId(long campaignId) {
		return campaignDao.getCampaignByCampaignId(campaignId);
	}

	@Override
	public List<CampaignDto> getCampaignList() {
		return campaignDao.getCampaignList();
	}

	@Override
	public void deleteByCampignId(long campaignId) {
		campaignDao.deleteByCampignId(campaignId);
	}

	@Override
	public void updateCampaign(CampaignDto campaignDto) {
		campaignDao.updateCampaign(campaignDto);

	}

	@Override
	public List<CampaignDto> campaignbyfilter(FilterParams filterParams) {
		return campaignDao.campaignbyfilter(filterParams);
	}

}
