package com.techprimers.jpa.springjpahibernateexample.model;

public class AccountIdentifier {

	private String CustomerAccountNumber;
	private String CurrencyCode;
	private String TypeCode;
	private String Amount;
	private String ItemCount;
	private String FundsType="Z";
	public String getFundsType() {
		return FundsType;
	}
	public void setFundsType(String fundsType) {
		FundsType = fundsType;
	}
	private String EndAccountIdentifier="/";
	public String getCustomerAccountNumber() {
		return CustomerAccountNumber;
	}
	public void setCustomerAccountNumber(String customerAccountNumber) {
		CustomerAccountNumber = customerAccountNumber;
	}
	public String getCurrencyCode() {
		return CurrencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		CurrencyCode = currencyCode;
	}
	public String getTypeCode() {
		return TypeCode;
	}
	public void setTypeCode(String typeCode) {
		TypeCode = typeCode;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getItemCount() {
		return ItemCount;
	}
	public void setItemCount(String itemCount) {
		ItemCount = itemCount;
	}
	
	public String getEndAccountIdentifier() {
		return EndAccountIdentifier;
	}
	public void setEndAccountIdentifier(String endAccountIdentifier) {
		EndAccountIdentifier = endAccountIdentifier;
	}


}
