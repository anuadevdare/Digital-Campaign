package com.digital.campaign.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.digital.campaign.entity.Campaign;

public interface CampaignRepository extends CrudRepository<Campaign, Long> {

}
