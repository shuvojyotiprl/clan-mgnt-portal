package com.in28minutes.springboot.web.model;


import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class War {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "war_generator")
	@SequenceGenerator(name="war_generator", sequenceName = "war_seq", allocationSize=50, initialValue = 151)	
	private int warid;
	private String clanname;
	private Date startdate;
	private Date enddate;
	private String status; //IN_PROGRESS ,  PREP_DAY , WON , LOST , DRAWN 
	
	@OneToMany
	private Set<Enemy> enemyList;
	
	
}
