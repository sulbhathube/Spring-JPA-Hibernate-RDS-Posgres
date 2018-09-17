package com.techprimers.jpa.springjpahibernateexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Entity(name = "impacs")
@Table(name = "impacs")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Impacs extends AuditModel{
	//id, key, accountnumber, transactiondate, amount, filename, dateloaded, 
    //data, creditdebit, postingdate
	@Id
    @GeneratedValue(generator = "id_generator")//@OneToOne(targetEntity = WireTrans.class)
	@Column(name = "transaction_id")
	@SequenceGenerator(
            name = "id_generator",
            sequenceName = "id_sequence",
            initialValue = 10000
    )
    private Long id;
	
	//@JsonIgnore
	//@OneToOne(mappedBy = "impacs")
	//private WireTrans wire;
	@Column(name = "key")
	private String Key;
	@Column(name = "accountnumber")
	private String accountnumber;
	@Column(name = "amount")
	private String amount;
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Column(name = "filename")
	private String filename;
	//@Transient
	//private JsonFormat data;
	//@Lob
	//@Column( length = 100000 )
	@Column(name = "jdata", nullable = false ,columnDefinition = "text")
    @Type(value = com.techprimers.jpa.springjpahibernateexample.model.JsonDataSample.class)
	private String jdata; 
	public String getJdata() {
		return jdata;
	}
	public void setJdata(String jdata) {
		this.jdata = jdata;
	}
	/*public WireTrans getWire() {
		return wire;
	}
	public void setWire(WireTrans wire) {
		this.wire = wire;
	}*/
	@Column(name = "creditdebit")
	private String creditdebit;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		this.Key = key;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	/*public JsonFormat getData() {
		return data;
	}
	public void setData(JsonFormat data) {
		this.data = data;
	}*/
	public String getCreditdebit() {
		return creditdebit;
	}
	public void setCreditdebit(String creditdebit) {
		this.creditdebit = creditdebit;
	}
	
	
	
}
