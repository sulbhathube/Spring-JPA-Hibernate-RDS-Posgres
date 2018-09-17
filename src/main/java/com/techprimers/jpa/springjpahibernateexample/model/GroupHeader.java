package com.techprimers.jpa.springjpahibernateexample.model;

public class GroupHeader {
	private String UltimateReceiverIdentification;
	private String OriginatorIdentification;
	private String GroupStatus="4"; 
	public String getGroupStatus() {
		return GroupStatus;
	}
	public void setGroupStatus(String groupStatus) {
		GroupStatus = groupStatus;
	}
	private String As_of_Date;
	private String As_of_Time;
	private String CurrencyCode="USD";
	public String getCurrencyCode() {
		return CurrencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		CurrencyCode = currencyCode;
	}
	private String As_of_DateModifier;
	private String EndGroupHeader="/";
	public String getEndGroupHeader() {
		return EndGroupHeader;
	}
	public void setEndGroupHeader(String endGroupHeader) {
		EndGroupHeader = endGroupHeader;
	}
	public String getAs_of_Time() {
		return As_of_Time;
	}
	public void setAs_of_Time(String as_of_Time) {
		As_of_Time = as_of_Time;
	}
	
	public String getAs_of_DateModifier() {
		return As_of_DateModifier;
	}
	public void setAs_of_DateModifier(String as_of_DateModifier) {
		As_of_DateModifier = as_of_DateModifier;
	}

	public String getUltimateReceiverIdentification() {
		return UltimateReceiverIdentification;
	}
	public void setUltimateReceiverIdentification(String ultimateReceiverIdentification) {
		UltimateReceiverIdentification = ultimateReceiverIdentification;
	}
	public String getOriginatorIdentification() {
		return OriginatorIdentification;
	}
	public void setOriginatorIdentification(String originatorIdentification) {
		OriginatorIdentification = originatorIdentification;
	}
	
	public String getAs_of_Date() {
		return As_of_Date;
	}
	public void setAs_of_Date(String as_of_Date) {
		As_of_Date = as_of_Date;
	}


}
