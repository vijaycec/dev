package com.Ashok.bean;

import java.util.Date;

import lombok.Data;

@Data
public class Contact {
	private Integer contactId;
	private String  contactName;
	private String  contactEmail;
	private String  contactNumber;
	private Date    createDate;
	private Date    updateDate;
	
	

}
