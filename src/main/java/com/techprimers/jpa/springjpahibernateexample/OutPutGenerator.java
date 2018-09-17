package com.techprimers.jpa.springjpahibernateexample;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.techprimers.jpa.springjpahibernateexample.model.AccountIdentifier;
import com.techprimers.jpa.springjpahibernateexample.model.AccountTrailer;
import com.techprimers.jpa.springjpahibernateexample.model.GroupHeader;
import com.techprimers.jpa.springjpahibernateexample.model.GroupTrailer;
import com.techprimers.jpa.springjpahibernateexample.model.HeaderInformation;
import com.techprimers.jpa.springjpahibernateexample.model.JsonDataSample;
import com.techprimers.jpa.springjpahibernateexample.model.TransactionDetail;
import com.techprimers.jpa.springjpahibernateexample.model.WireTrans;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class OutPutGenerator {

	StringBuilder Header= new StringBuilder();
	StringBuilder GroupHeader=new StringBuilder();
	StringBuilder AccountIdentifier=new StringBuilder();
	StringBuilder TransactionDetails=new StringBuilder();
	StringBuilder AccountTrailers=new StringBuilder();
	StringBuilder GroupTrailers=new StringBuilder();
	StringBuilder FinalOutput= new StringBuilder();
	//static String ="";
	public StringBuilder CreateHeader(HeaderInformation h) {
		Header.append("01").append(",");
		Header.append(h.getSenderIdentification()).append(",");
		Header.append(h.getSenderIdentification()).append(",");
		Header.append(h.getReceiverIdentification()).append(",");
		Header.append(h.getFileCreationDate()).append(",");
		Header.append(h.getFileIdentificationNumber()).append(",");
		Header.append(h.getPhysicalRecordLength()).append(",");
		Header.append(h.getBlockSize()).append(",");
		Header.append(h.getVersionNumber()).append(",");
		Header.append(h.getEndHeader());
		
		return Header;
	}
	public StringBuilder CreateGroupHeader(GroupHeader g) {
		GroupHeader.append("\n");
		GroupHeader.append("02").append(",");
		GroupHeader.append(g.getUltimateReceiverIdentification()).append(",");
		GroupHeader.append(g.getOriginatorIdentification()).append(",");
		GroupHeader.append(g.getGroupStatus()).append(",");
		GroupHeader.append(g.getAs_of_Date()).append(",");
		GroupHeader.append(g.getAs_of_Time()).append(",");
		GroupHeader.append(g.getCurrencyCode()).append(",");
		GroupHeader.append(g.getAs_of_DateModifier()).append(",");
		GroupHeader.append(g.getEndGroupHeader());
		
		return GroupHeader;
	}
	public StringBuilder createAccountIdentifier(AccountIdentifier i) {
		AccountIdentifier.append("\n");
		AccountIdentifier.append("03").append(",");
		AccountIdentifier.append(i.getCustomerAccountNumber()).append(",");
		AccountIdentifier.append(i.getCurrencyCode()).append(",");
		AccountIdentifier.append(i.getTypeCode()).append(",");
		AccountIdentifier.append(i.getAmount()).append(",");
		AccountIdentifier.append(i.getItemCount()).append(",");
		AccountIdentifier.append(i.getFundsType()).append(",");
		AccountIdentifier.append(i.getEndAccountIdentifier());

		return AccountIdentifier;
	}
	public StringBuilder CreateTransactionDetails(TransactionDetail d) {
		TransactionDetails.append("\n");
		TransactionDetails.append("16").append(",");
		TransactionDetails.append(d.getTypeCode()).append(",");
		TransactionDetails.append(d.getAmount()).append(",");
		TransactionDetails.append(d.getFundsType()).append(",");
		TransactionDetails.append(d.getBankReferenceNumber()).append(",");
		TransactionDetails.append(d.getCustomerReferenceNumber()).append(",");
		TransactionDetails.append(d.getText()).append(",");
		TransactionDetails.append(d.getEndTransactionDetails());

		return TransactionDetails;

	}

	public StringBuilder CreateAccountTrailer(AccountTrailer t) {
		AccountTrailers.append("\n");
		AccountTrailers.append("49").append(",");
		AccountTrailers.append(t.getAccountControlTotal()).append(",");
		AccountTrailers.append(t.getNumberofRecords()).append(",");
		AccountTrailers.append(t.getEndAccountTrailer());
		System.out.println(t.getEndAccountTrailer());
		return AccountTrailers;
	}

	public StringBuilder CreateGroupTrailer(GroupTrailer gt) {
		GroupTrailers.append("\n");
		GroupTrailers.append("98").append(",");
		GroupTrailers.append(gt.getGroupControlTotal()).append(",");
		GroupTrailers.append(gt.getNumberofAccounts()).append(",");
		GroupTrailers.append(gt.getNumberofRecords()).append(",");
		GroupTrailers.append(gt.getEndGroupTrailer());
		System.out.println(gt.getEndGroupTrailer());
		return GroupTrailers;

	}
	public StringBuilder GenerateOutput( List<WireTrans> l) {
		HeaderInformation h= new HeaderInformation();
		GroupHeader g = new GroupHeader();
		AccountIdentifier a= new AccountIdentifier();
		TransactionDetail t = new TransactionDetail();
		AccountTrailer at = new AccountTrailer();
		GroupTrailer gt= new GroupTrailer();
		for (WireTrans s : l)
		{
		     
		     if (s.getImpacs().getJdata() != null) {
		    	 ObjectMapper objectMapper = new ObjectMapper();
		    	 JsonDataSample j1;
				try {
					j1 = objectMapper.readValue(s.getImpacs().getJdata(), JsonDataSample.class);
					System.out.println(j1.getNacha6().getIdentificationNumber());
					
					h.setSenderIdentification(j1.getNacha6().getIdentificationNumber());
					h.setReceiverIdentification(j1.getNacha6().getReceivingDFIIdentification());
					h.setFileCreationDate(j1.getDate());
					h.setFileCreationTime("");//need to check what is this value, from where will get this value
					h.setFileIdentificationNumber("");//need to check 
					h.setPhysicalRecordLength("");
					h.setBlockSize("");
					h.setVersionNumber("2");
					
					g.setUltimateReceiverIdentification("");
					g.setOriginatorIdentification(j1.getNacha5().getOriginatingDFIIdentification());
					g.setGroupStatus(j1.getNacha5().getOriginatorStatusCode());
					g.setAs_of_Date(j1.getNacha5().getEffectiveEntryDate());
					g.setAs_of_Time("");
					g.setCurrencyCode(g.getCurrencyCode());
					g.setAs_of_DateModifier("");
					
					a.setCustomerAccountNumber(s.getImpacs().getAccountnumber());
					a.setCurrencyCode(g.getCurrencyCode());
					a.setTypeCode(j1.getNacha5().getRecordTypeCode());
					a.setAmount(s.getImpacs().getAmount());
					a.setItemCount("");
					a.setFundsType("");
					
					t.setTypeCode(j1.getNacha6().getRecordTypeCode());
					t.setAmount(s.getImpacs().getAmount());
					t.setText("This is sample Text!!");
					
					at.setAccountControlTotal("");
					at.setEndAccountTrailer(at.getEndAccountTrailer());
					at.setNumberofRecords("");
					
					
					gt.setEndGroupTrailer(gt.getEndGroupTrailer());
					gt.setGroupControlTotal("");
					gt.setNumberofAccounts("");
					gt.setNumberofRecords("");
					
					FinalOutput.append(CreateHeader(h)).append(CreateGroupHeader(g)).append(createAccountIdentifier(a)).append(CreateTransactionDetails(t)).append(CreateAccountTrailer(at)).append(CreateGroupTrailer(gt));
					//FinalOutput.append(Header.toString()).append(GroupHeader.toString()).append(AccountIdentifier.toString()).append(TransactionDetails.toString()).append(AccountTrailers.toString()).append(GroupTrailers.toString());
					System.out.println(FinalOutput.toString());
						
				} catch (JsonParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JsonMappingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
		     }
		     
		}
		
		
		return FinalOutput;	
	}
	
	
	/*public static void main(String a[]) {
		System.out.println("Hello ");
		ObjectMapper objectMapper = new ObjectMapper();

		File file = new File("./src/main/resources/SampleJSONData.json");

		try {
			JsonDataSample j1 = objectMapper.readValue(file, JsonDataSample.class);
			System.out.println(j1.toString());
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}*/
	
}

