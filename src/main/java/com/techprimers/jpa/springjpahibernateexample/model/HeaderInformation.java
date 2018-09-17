package com.techprimers.jpa.springjpahibernateexample.model;

public class HeaderInformation {
	
	private String SenderIdentification;
	private String ReceiverIdentification;
	private String FileCreationDate;
	private String FileCreationTime;
	private String FileIdentificationNumber;
	private String PhysicalRecordLength;
	private String BlockSize;
	private String VersionNumber;
	private String EndHeader="/";
	
	public String getEndHeader() {
		return EndHeader;
	}
	public void setEndHeader(String endHeader) {
		EndHeader = endHeader;
	}
	public String getSenderIdentification() {
		return SenderIdentification;
	}
	public void setSenderIdentification(String senderIdentification) {
		SenderIdentification = senderIdentification;
	}
	public String getReceiverIdentification() {
		return ReceiverIdentification;
	}
	public void setReceiverIdentification(String receiverIdentification) {
		ReceiverIdentification = receiverIdentification;
	}
	public String getFileCreationDate() {
		return FileCreationDate;
	}
	public void setFileCreationDate(String fileCreationDate) {
		FileCreationDate = fileCreationDate;
	}
	public String getFileCreationTime() {
		return FileCreationTime;
	}
	public void setFileCreationTime(String fileCreationTime) {
		FileCreationTime = fileCreationTime;
	}
	public String getFileIdentificationNumber() {
		return FileIdentificationNumber;
	}
	public void setFileIdentificationNumber(String fileIdentificationNumber) {
		FileIdentificationNumber = fileIdentificationNumber;
	}
	public String getPhysicalRecordLength() {
		return PhysicalRecordLength;
	}
	public void setPhysicalRecordLength(String physicalRecordLength) {
		PhysicalRecordLength = physicalRecordLength;
	}
	public String getBlockSize() {
		return BlockSize;
	}
	public void setBlockSize(String blockSize) {
		BlockSize = blockSize;
	}
	public String getVersionNumber() {
		return VersionNumber;
	}
	public void setVersionNumber(String versionNumber) {
		VersionNumber = versionNumber;
	}

	

}
