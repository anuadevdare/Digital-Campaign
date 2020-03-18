package com.digital.campaign.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digital.campaign.dto.CampaignDto;
import com.digital.campaign.service.CampaignService;

/**
 * Rest Controller for the create,update,delete and fetch campaign
 * 
 * @since 1.0
 */
@RestController
public class CampaignController {
	@Autowired
	CampaignService campaignService;

	@PostMapping(path = "/createcampaign", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createSurvey(@Valid @RequestBody CampaignDto campaignDto) {
		campaignService.createCampaign(campaignDto);

	}

}
