package com.in28minutes.springboot.web.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.web.model.War;


@Repository
public interface WarRepository extends JpaRepository<War,Integer>{
	
	List<War> findByStatus(String status);
}
