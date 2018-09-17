package com.techprimers.jpa.springjpahibernateexample.model;

public class Nacha6 {
	private String checkDigit;
	public String getCheckDigit() {
		return checkDigit;
	}
	public void setCheckDigit(String checkDigit) {
		this.checkDigit = checkDigit;
	}
	public String getTraceNumber() {
		return traceNumber;
	}
	public void setTraceNumber(String traceNumber) {
		this.traceNumber = traceNumber;
	}
	public String getDexPar() {
		return dexPar;
	}
	public void setDexPar(String dexPar) {
		this.dexPar = dexPar;
	}
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getDfiAccountNumber() {
		return dfiAccountNumber;
	}
	public void setDfiAccountNumber(String dfiAccountNumber) {
		this.dfiAccountNumber = dfiAccountNumber;
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getReceivingDFIIdentification() {
		return receivingDFIIdentification;
	}
	@Override
	public String toString() {
		return "Nacha6 [checkDigit=" + checkDigit + ", traceNumber=" + traceNumber + ", dexPar=" + dexPar
				+ ", identificationNumber=" + identificationNumber + ", dfiAccountNumber=" + dfiAccountNumber
				+ ", transactionCode=" + transactionCode + ", amount=" + amount + ", receivingDFIIdentification="
				+ receivingDFIIdentification + ", discretionaryData=" + discretionaryData + ", addendaRecordIndicator="
				+ addendaRecordIndicator + ", recordTypeCode=" + recordTypeCode + ", individualName=" + individualName
				+ "]";
	}
	public void setReceivingDFIIdentification(String receivingDFIIdentification) {
		this.receivingDFIIdentification = receivingDFIIdentification;
	}
	public String getDiscretionaryData() {
		return discretionaryData;
	}
	public void setDiscretionaryData(String discretionaryData) {
		this.discretionaryData = discretionaryData;
	}
	public String getAddendaRecordIndicator() {
		return addendaRecordIndicator;
	}
	public void setAddendaRecordIndicator(String addendaRecordIndicator) {
		this.addendaRecordIndicator = addendaRecordIndicator;
	}
	public String getRecordTypeCode() {
		return recordTypeCode;
	}
	public void setRecordTypeCode(String recordTypeCode) {
		this.recordTypeCode = recordTypeCode;
	}
	public String getIndividualName() {
		return individualName;
	}
	public void setIndividualName(String individualName) {
		this.individualName = individualName;
	}
	private String traceNumber;
	private String dexPar;
	private String identificationNumber;
	private String dfiAccountNumber;
	private String transactionCode;
	private String amount;
	private String receivingDFIIdentification;
	private String discretionaryData;
	private String addendaRecordIndicator;
	private String recordTypeCode;
	private String individualName;
	

}
