package com.in28minutes.springboot.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ENEMY_BASE")
public class Enemy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int serialnumber;
	private int townhall;
	private String strengthlevel;
	private String remarks;
	@Override
	public String toString() {
		return "Enemy [serialnumber=" + serialnumber + ", townhall=" + townhall + ", strengthlevel=" + strengthlevel
				+ ", remarks=" + remarks + "]";
	}
	public Enemy(int serialnumber, int townhall, String strengthlevel, String remarks) {
		super();
		this.serialnumber = serialnumber;
		this.townhall = townhall;
		this.strengthlevel = strengthlevel;
		this.remarks = remarks;
	}
	public Enemy() {
		super();
	}
	public int getSerialnumber() {
		return serialnumber;
	}
	public void setSerialnumber(int serialnumber) {
		this.serialnumber = serialnumber;
	}
	public int getTownhall() {
		return townhall;
	}
	public void setTownhall(int townhall) {
		this.townhall = townhall;
	}
	public String getStrengthlevel() {
		return strengthlevel;
	}
	public void setStrengthlevel(String strengthlevel) {
		this.strengthlevel = strengthlevel;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}


