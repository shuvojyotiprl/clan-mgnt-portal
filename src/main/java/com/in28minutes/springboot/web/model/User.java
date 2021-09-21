package com.in28minutes.springboot.web.model;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {

	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	private String password;
	private boolean active;
	private String roles;
	private String team;
	
	private String playerId;
	private int townhall;
	private String email;
	
	private String adminremarks;
	
	private Boolean approved;
	
	@OneToMany
	private List<Enemy> targetEnemy;
	
	
	public User() {
		super();
	}


	
	public User(int id, String username, String password, boolean active, String roles, String team, String playerId,
			int townhall, String email, String adminremarks, Boolean approved, List<Enemy> targetEnemy) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.active = active;
		this.roles = roles;
		this.team = team;
		this.playerId = playerId;
		this.townhall = townhall;
		this.email = email;
		this.adminremarks = adminremarks;
		this.approved = approved;
		this.targetEnemy = targetEnemy;
	}


	


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", active=" + active
				+ ", roles=" + roles + ", team=" + team + ", playerId=" + playerId + ", townhall=" + townhall
				+ ", email=" + email + ", adminremarks=" + adminremarks + ", approved=" + approved + ", targetEnemy="
				+ targetEnemy + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}



	public String getRoles() {
		return roles;
	}



	public void setRoles(String roles) {
		this.roles = roles;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		this.team = team;
	}



	public String getPlayerId() {
		return playerId;
	}



	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}



	public int getTownhall() {
		return townhall;
	}



	public void setTownhall(int townhall) {
		this.townhall = townhall;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAdminremarks() {
		return adminremarks;
	}



	public void setAdminremarks(String adminremarks) {
		this.adminremarks = adminremarks;
	}



	public Boolean getApproved() {
		return approved;
	}



	public void setApproved(Boolean approved) {
		this.approved = approved;
	}



	public List<Enemy> getTargetEnemy() {
		return targetEnemy;
	}



	public void setTargetEnemy(List<Enemy> targetEnemy) {
		this.targetEnemy = targetEnemy;
	}

	
	

	
}
