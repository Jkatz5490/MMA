package com.MMA.organization.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organization {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long organizationId;
	private String ufc;
	private String belator;

}
