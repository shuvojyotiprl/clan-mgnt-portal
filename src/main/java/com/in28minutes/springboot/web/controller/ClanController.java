package com.in28minutes.springboot.web.controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.springboot.web.common.UserSession;
import com.in28minutes.springboot.web.model.User;
import com.in28minutes.springboot.web.service.UserRepository;


@Controller
public class ClanController {

	
	Set<User> selectedUsersForWar = new HashSet<User>();
	
	@Autowired
	UserRepository userRepo;

	@RequestMapping(value = "/clan", method = RequestMethod.GET)
	public String showClanHome(ModelMap model) {
		String name = UserSession.getLoggedInUserName(model);
		model.put("name", name);
		return "clan/clan-home";
	}
	
	
	@RequestMapping(value = "/clan/register", method = RequestMethod.GET)
	public String showClanHomeRegister(ModelMap model) {
		String name = UserSession.getLoggedInUserName(model);
		
		model.addAttribute("user", new User(0,"name","passwd",true,
				"ROLE_USER","team","player",0,"email",null, false,null));
		
		
		model.put("name", name+"_addiotional");
		return "clan/clan-home-register";
	}
	
	@RequestMapping(value = "/clan/register", method = RequestMethod.POST)
	public String regiserNewPlayer(ModelMap model, @Valid User user, BindingResult result) {
		
		if (result.hasErrors()) {

			result.getAllErrors().stream().forEach(System.out::println);
			return "redirect:/clan/register";
		}
		//String name = UserSession.getLoggedInUserName(model);
		user.setRoles("ROLE_USER");
		userRepo.save(user);
		
		return "clan/success";
	}
	
	
	@RequestMapping(value = "/clan/pending-requests", method = RequestMethod.GET)
	public String pendingApprovals(ModelMap model) {
		
		List<User> liUser = userRepo.findAll().stream().filter(user->user.getApproved()==null)
				.collect(Collectors.toList());
		//String name = UserSession.getLoggedInUserName(model);
		
		model.put("users", liUser);
		return "clan/clan-approve-user";
	}
	
	@RequestMapping(value = "/clan/approve", method = RequestMethod.GET)
	public String approveForm(ModelMap model,
			@RequestParam int id) {
		
		User user = userRepo.findById(id).get();
		System.out.println(user);
		model.addAttribute("user",user);
		
		return "/clan/clan-approve-user-form";
	}
	
	

	@RequestMapping(value = "/clan/approve", method = RequestMethod.POST)
	public String approve(ModelMap model,@Valid User user,
			@RequestParam int id) {
		
		user.setApproved(true);
		userRepo.save(user);
		return "redirect:/clan/pending-requests";
	}
	
	@RequestMapping(value = "/clan/available-players", method = RequestMethod.GET)
	public String avaiablePlayers(ModelMap model) {
		List<User> users = userRepo.findAll().stream()
				.filter(u->u.getApproved()).collect(Collectors.toList());
		model.put("users", users);
		
		
		return "/clan/clan-available-players";
	}
	
	
	@RequestMapping(value = "/clan/available-players/preare-team", method = RequestMethod.GET)
	public String selectPlayers(ModelMap model, @RequestParam String id) {
		
		int userid = Integer.parseInt(id);
		selectedUsersForWar.add(userRepo.findById(userid).get());
		selectedUsersForWar.stream().forEach(u->{
			System.out.println(u.getUsername());
		});
		return "redirect:/clan/available-players";
	}
}
