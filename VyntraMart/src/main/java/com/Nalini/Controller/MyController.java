package com.Nalini.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Nalini.Model.UserModel;
import com.Nalini.dao.UserRepo;



@Controller
public class MyController {
	
	@Autowired
	UserRepo repo;
	
	@RequestMapping("VyntraMart")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String addUser(UserModel user)
	{
		repo.save(user);
		return "login";
	}

}
