package com.digital.campaign.dto;

public class ResponseDto {

	private long responseId;

	/**
	 * The response options available for a question in the native language.
	 */
	private String responseOption;

	/**
	 * @param responseId
	 * @param responseOption
	 */
	public ResponseDto(long responseId, String responseOption) {
		super();
		this.responseId = responseId;
		this.responseOption = responseOption;
	}

	public long getResponseId() {
		return responseId;
	}

	public void setResponseId(long responseId) {
		this.responseId = responseId;
	}

	public String getResponseOption() {
		return responseOption;
	}

	public void setResponseOption(String responseOption) {
		this.responseOption = responseOption;
	}

	@Override
	public String toString() {
		return "ResponseDto [responseId=" + responseId + ", responseOption=" + responseOption + "]";
	}

}
