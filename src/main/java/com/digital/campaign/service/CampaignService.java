package com.digital.campaign.service;

import java.util.List;

import com.digital.campaign.dto.CampaignDto;
import com.digital.campaign.dto.FilterParams;
/**
 * The CampaignService responsible to create the campaign for multiple questions
 * and their possible answers for the particular company,Display list of all
 * campaign,get campaign by id,if campaign is not started then campaign can
 * delete or update
 */
public interface CampaignService {

	public void createCampaign(CampaignDto campaign);

	public CampaignDto getCampaignByCampaignId(long campaignId);

	public List<CampaignDto> getCampaignList();

	public void deleteByCampignId(long campaignId);

	public void updateCampaign(CampaignDto campaignDto);

	public List<CampaignDto> campaignbyfilter(FilterParams filterParams);
}
