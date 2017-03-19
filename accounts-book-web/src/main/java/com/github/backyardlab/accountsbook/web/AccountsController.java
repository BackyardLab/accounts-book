package com.github.backyardlab.accountsbook.web;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.backyardlab.accountsbook.core.AccountsBookService;
import com.github.backyardlab.accountsbook.model.Account;
import com.github.backyardlab.accountsbook.model.User;

@Controller
public class AccountsController {

	@Autowired AccountsBookService service;
	
	@RequestMapping(value="/accounts", method=RequestMethod.GET)
	public String accounts(Model model, Principal authUser) {
		User user = service.getUser(authUser.getName());
		List<Account> accounts = service.getAccounts(user);
		model.addAttribute("accounts", accounts);
		return "accounts";
	}
}
