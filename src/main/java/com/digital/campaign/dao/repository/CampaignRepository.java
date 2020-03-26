package com.digital.campaign.dao.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.digital.campaign.entity.Campaign;



public interface CampaignRepository extends CrudRepository<Campaign, Long> {
	/**
	 * Returns the campaign status of the campaign 
	 * 
	 * @param campaignId campaign Id for fetching the campaign status 
	 * 
	 * @return campaign status by campaign Id
	 */
	//@Query(value = "select case when status=:status then true else false end from Campaign where campaignId=:campaignId")
	@Query("select c.status from Campaign c where campaignId=:campaignId")
	String isInitState(@Param("campaignId") long campaignId);

}
