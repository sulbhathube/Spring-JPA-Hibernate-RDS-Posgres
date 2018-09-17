package com.techprimers.jpa.springjpahibernateexample.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class JsonDataSample {
	
	private String date;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	private Nacha5 nacha5;
	public Nacha5 getNacha5() {
		return nacha5;
	}
	@Override
	public String toString() {
		return "JsonDataSample [date=" + date + ", nacha5=" + nacha5 + ", nacha6=" + nacha6 + "]";
	}
	public void setNacha5(Nacha5 nacha5) {
		this.nacha5 = nacha5;
	}
	public Nacha6 getNacha6() {
		return nacha6;
	}
	public void setNacha6(Nacha6 nacha6) {
		this.nacha6 = nacha6;
	}


	private Nacha6 nacha6;
	
	

}
