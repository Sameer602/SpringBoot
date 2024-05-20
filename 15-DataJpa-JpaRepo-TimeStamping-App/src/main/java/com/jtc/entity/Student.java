package com.jtc.entity;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer studentId;
	  private String studentName;
	  private Integer studentClass;
	  private String studentAddr;
	  
	  @CreationTimestamp
	  @Column(name="date_created",updatable=false)
	  private LocalDate dateCreated;
	  
	  @UpdateTimestamp
	  @Column(name="last_updated",insertable=false)
	  private LocalDate lastUpdated;

}
