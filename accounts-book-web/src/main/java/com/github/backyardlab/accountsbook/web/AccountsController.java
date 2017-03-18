package com.github.backyardlab.accountsbook.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountsController {

	@RequestMapping(value="/accounts", method=RequestMethod.GET)
	public String accounts() {
		return "accounts";
	}
}
