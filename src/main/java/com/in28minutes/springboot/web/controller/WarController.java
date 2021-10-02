package com.in28minutes.springboot.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.in28minutes.springboot.web.model.War;
import com.in28minutes.springboot.web.service.WarRepository;

@Controller
public class WarController {
	
	@Autowired
	private WarRepository warRepository;
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// Date - dd/MM/yyyy
		SimpleDateFormat startdate = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				startdate, false));
	}
	
	@RequestMapping(path = "/clan/war", method = RequestMethod.GET)
	public String clanWarHomee(ModelMap model) {
		
		List<War> activeWars = warRepository.findByStatus("PROGRESS");
		System.out.println(activeWars);
		model.put("wars", activeWars);
		return "clan/war/war-home";  
	}
	
	
	@RequestMapping(path = "/clan/war/start-war", method = RequestMethod.GET)
	public String startNewWarForm(ModelMap model) {
		War war = new War();
		war.setClanname("Enemy Clan");
		war.setStartdate(new Date());
		war.setEnddate(new Date());
		
		model.put("war", war);
		return "clan/war/start-war";
	}
	
	
	@RequestMapping(path = "/clan/war/start-war", method = RequestMethod.POST)
	public String addWarToDb(ModelMap model,@Valid War war,BindingResult result) {
		//System.out.println(war);
		
		war.setStatus("PROGRESS");
		warRepository.save(war);
		return "redirect:/clan/war";
	}
}
