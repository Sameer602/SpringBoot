package com.jtc.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class AccountPK implements Serializable{
	
	private Integer  accNo;
	
	private String  accType;

}
