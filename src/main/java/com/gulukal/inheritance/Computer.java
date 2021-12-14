package com.gulukal.inheritance;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString


// inheritance
// super class Entity table yazmadım
@MappedSuperclass
public class Computer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "computer_id", nullable = false)
	private int computerId;
	
	@Column(name = "ram")
	private String ram;
	
	@Column(name = "cpu")
	private String cpu;
	
	@Temporal(value = TemporalType.TIME)
	@CreationTimestamp
	@Column(name = "created_date")
	private Date createdDate;
	

	
}
