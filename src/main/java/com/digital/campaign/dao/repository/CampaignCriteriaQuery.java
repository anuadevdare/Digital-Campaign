package com.digital.campaign.dao.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.digital.campaign.dto.CampaignListDto;
import com.digital.campaign.entity.Campaign;

@Repository
public class CampaignCriteriaQuery {
	@PersistenceContext
	EntityManager entityManager;

	/**
	 * findAllCampaign provides list of all CampaignDto using criteria query
	 * 
	 * @return list of all ExpenseDto
	 */
	public List<CampaignListDto> findAllCampain() {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<CampaignListDto> criteriaQuery = criteriaBuilder.createQuery(CampaignListDto.class);
		Root<Campaign> root = criteriaQuery.from(Campaign.class);

		TypedQuery<CampaignListDto> query = entityManager.createQuery(criteriaQuery);
		System.out.println(query.toString());
		try {
			return query.getResultList();
		} catch (NoResultException nre) {
			return null;
		}
	}
}
