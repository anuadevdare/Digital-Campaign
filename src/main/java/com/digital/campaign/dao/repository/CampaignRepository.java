package com.digital.campaign.dao.repository;

import java.util.Date;
import java.util.List;
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
	@Query("select c.status from Campaign c where campaignId=:campaignId")
	String isInitState(@Param("campaignId") long campaignId);

	List<Campaign> findByCreatedDate(Date createdDate);

	@Query("select a from Campaign a where a.startDate = :startDate")
	List<Campaign> findByStartDate(@Param("startDate") Date startDate);

	List<Campaign> findByEndDate(Date endDate);

	@Query("select a from Campaign a where a.startDate <= :startDate")
	List<Campaign> findByStartDateBefore(@Param("startDate") Date startDate);

	// List<Campaign> findByStartDateAfterAndfindByEndDateBefore(Date startDate,Date
	// endDate);

	List<Campaign> findByCompanyId(long companyId);

}
