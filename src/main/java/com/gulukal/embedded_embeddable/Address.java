package com.gulukal.embedded_embeddable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@ToString


@Embeddable
public class Address {
	
	private String city;
	
	private String country;
	
	private String postCode;
	
	
	
	public Address(String city, String country, String postCode) {
		this.city = city;
		this.country = country;
		this.postCode = postCode;
	}
	
	
	
}
