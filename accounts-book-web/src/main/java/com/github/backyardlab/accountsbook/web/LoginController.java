package com.github.backyardlab.accountsbook.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping(value="/authenticate", method=RequestMethod.GET)
	public String authenticate() {
		return "login";
	}
	
}
