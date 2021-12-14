package com.gulukal.embedded_embeddable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "person")
public class PersonEntity  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "tc_number")
	private String tcNumber;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "email_address")
	private String emailAddres;
	
	@Column(name = "created_date")
	@Temporal(value = TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createdDate;
	
	// Embedded
	@Embedded
	private Address address;
	

	
}
