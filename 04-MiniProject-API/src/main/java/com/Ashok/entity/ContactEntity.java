/*package com.Ashok.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;



@Data
@Entity
@Table(name = "CONTACT_DETAILS_10")
public class ContactEntity {
	@Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer contactId;
	private String  contactName;
	private String  contactEmail;
	private String  contactNumber;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date    createDate;
	
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	private Date    updateDate;
	
}
*/