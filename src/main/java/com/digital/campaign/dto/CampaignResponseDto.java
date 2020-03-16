package com.digital.campaign.dto;

public class CampaignResponseDto {

	/**
	 * The unique campaign identifier of the campaign across TechPulse
	 */
	private long campaignId;

	/**
	 * The unique company identifier across TechPulse
	 */
	private long companyId;

	/**
	 * The unique user identifier across TechPulse
	 */
	private long userId;

	/**
	 * The unique device identifier across TechPulse
	 */
	private long deviceId;

	/**
	 * @param campaignId
	 * @param companyId
	 * @param userId
	 * @param deviceId
	 */
	public CampaignResponseDto(long campaignId, long companyId, long userId, long deviceId) {
		super();
		this.campaignId = campaignId;
		this.companyId = companyId;
		this.userId = userId;
		this.deviceId = deviceId;
	}

	public long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(long campaignId) {
		this.campaignId = campaignId;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(long deviceId) {
		this.deviceId = deviceId;
	}

	@Override
	public String toString() {
		return "CampaignResponseDto [campaignId=" + campaignId + ", companyId=" + companyId + ", userId=" + userId
				+ ", deviceId=" + deviceId + "]";
	}

}
