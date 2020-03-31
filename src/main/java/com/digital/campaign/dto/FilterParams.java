package com.digital.campaign.dto;

public class FilterParams {

	private String columnName;
	private String filterValue;
	private String filterOprator;

	public FilterParams() {
		super();
	}

	/**
	 * @param columnName
	 * @param filterValue
	 * @param filterOprator
	 */
	public FilterParams(String columnName, String filterValue, String filterOprator) {
		super();
		this.columnName = columnName;
		this.filterValue = filterValue;
		this.filterOprator = filterOprator;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getFilterValue() {
		return filterValue;
	}

	public void setFilterValue(String filterValue) {
		this.filterValue = filterValue;
	}

	public String getFilterOprator() {
		return filterOprator;
	}

	public void setFilterOprator(String filterOprator) {
		this.filterOprator = filterOprator;
	}

	
}
