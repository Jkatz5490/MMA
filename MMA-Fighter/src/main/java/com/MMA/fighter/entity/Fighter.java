package com.MMA.fighter.entity;

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
public class Fighter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long fighterId;
	private String fighterFirstName;
	private String fighterLastName;
	private String fighterRecord;
	private Long organizationId;

}
