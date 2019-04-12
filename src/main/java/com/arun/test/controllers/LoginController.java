package com.arun.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arun.test.beans.Entry;
import com.arun.test.beans.Login;
import com.arun.test.dao.LoginDao;

@Controller
public class LoginController {
	@Autowired
	LoginDao logindao;

	@RequestMapping(value = "/addentry", method = RequestMethod.POST)
	public String showform(@ModelAttribute("login") Login login, Model m) {
		System.out.println(login.getUsername() + " :::" + login.getPassword());
		String isValid = logindao.validate(login.getUsername(), login.getPassword());
		System.out.println("isValid:=" + isValid);

		if (isValid.equalsIgnoreCase("G"))
			return "addentry";
		if (isValid.equalsIgnoreCase("A"))
			return "redirect:/viewentries";
		else {
			m.addAttribute("DNE", "User Does not Exist Try Again");
			return "guestLogin";
		}

	}

	@RequestMapping("/guestLogin")
	public String guestLogin(Model m) {
		m.addAttribute("command", new Entry());
		System.out.println("Inside guestLogin");
		return "guestLogin";
	}

	@RequestMapping("/adminLogin")
	public String validateLogin(Model m) {
		m.addAttribute("command", new Entry());
		System.out.println("Inside adminLogin");
		return "adminLogin";
	}

}
