package com.gulukal.inheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.ToString;


@ToString

@Entity
@Table(name = "msi")
public class MsiEntity extends Computer {

	
	private String msiSupport;
	
	// parametreli constrctor
	public MsiEntity() {
		
	}
	
	// parametreli constructor
	public MsiEntity(String ram, String cpu, String msiSupport) {
		super(ram, cpu);
		this.msiSupport = msiSupport;
	}
	
	// getter and setter
	public String getMsiSupport() {
		return msiSupport;
	}
	
	public void setMsiSupport(String msiSupport) {
		this.msiSupport = msiSupport;
	}
	
}
