package com.digital.campaign.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital.campaign.dao.CampaignDao;
import com.digital.campaign.dto.CampaignDto;
import com.digital.campaign.service.CampaignService;

@Service
public class CampaignServiceImpl implements CampaignService {

	@Autowired
	CampaignDao campaignDao;
	@Override
	public void createCampaign(CampaignDto campaign) {
		campaignDao.createCampign(campaign);
	}

}
