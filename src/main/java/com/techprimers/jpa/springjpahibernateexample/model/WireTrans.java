package com.techprimers.jpa.springjpahibernateexample.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Entity(name = "wire_transaction")
@Table(name = "wire_transaction")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class WireTrans extends AuditModel{
	
	
	@Id
	@Column(name = "id")
    private Long transaction_id;
	public Long getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(Long transaction_id) {
		this.transaction_id = transaction_id;
		
	}
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name="transaction_id" ,referencedColumnName = "transaction_id")
	@MapsId
	private Impacs impacs;
	
	//@Transient
	//private JsonFormat wire_attributes;
	
	public Impacs getImpacs() {
		return impacs;
	}
	public void setImpacs(Impacs impacs) {
		this.impacs = impacs;
	}
	//@Lob
	@Type(value = com.techprimers.jpa.springjpahibernateexample.model.JsonDataSample.class)
	@Column(name = "wireattributes" ,columnDefinition = "text")
	private String wireattributes; 
	
	
	public String getWireattributes() {
		return wireattributes;
	}
	public void setWireattributes(String wireattributes) {
		this.wireattributes = wireattributes;
	}
	
	

}
