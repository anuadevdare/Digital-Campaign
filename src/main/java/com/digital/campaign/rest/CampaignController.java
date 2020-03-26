package com.digital.campaign.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public void createCampaign(@Valid @RequestBody CampaignDto campaignDto) {
		campaignService.createCampaign(campaignDto);

	}
	@PutMapping(path = "/updatecampaign", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateCampaign(@Valid @RequestBody CampaignDto campaignDto) {
		campaignService.updateCampaign(campaignDto);

	}

	@GetMapping(path="/findcampaign/{campaignId}")
	public CampaignDto getCampaignByCampaignId(@PathVariable long campaignId)
	{
		return campaignService.getCampaignByCampaignId(campaignId);
	}
	
	@GetMapping(path="/campaignList")
	public List<CampaignDto> getCampaignList()
	{
		return campaignService.getCampaignList();
	}
	@DeleteMapping(path="/deleteCampaign/{campaignId}")
	public void deleteByCampignId(@PathVariable long campaignId)
	{
		campaignService.deleteByCampignId(campaignId);
	}
}
