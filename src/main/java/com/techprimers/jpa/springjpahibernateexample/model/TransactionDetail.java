package com.techprimers.jpa.springjpahibernateexample.model;

public class TransactionDetail {
	private String TypeCode;
	private String Amount;
	private String FundsType="Z";
	public String getFundsType() {
		return FundsType;
	}
	public void setFundsType(String fundsType) {
		FundsType = fundsType;
	}
	private String BankReferenceNumber;
	private String CustomerReferenceNumber;
	private String Text;
	private String EndTransactionDetails="/";
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
	
	public String getBankReferenceNumber() {
		return BankReferenceNumber;
	}
	public void setBankReferenceNumber(String bankReferenceNumber) {
		BankReferenceNumber = bankReferenceNumber;
	}
	public String getCustomerReferenceNumber() {
		return CustomerReferenceNumber;
	}
	public void setCustomerReferenceNumber(String customerReferenceNumber) {
		CustomerReferenceNumber = customerReferenceNumber;
	}
	public String getText() {
		return Text;
	}
	public void setText(String text) {
		Text = text;
	}
	public String getEndTransactionDetails() {
		return EndTransactionDetails;
	}
	public void setEndTransactionDetails(String endTransactionDetails) {
		EndTransactionDetails = endTransactionDetails;
	}

}
