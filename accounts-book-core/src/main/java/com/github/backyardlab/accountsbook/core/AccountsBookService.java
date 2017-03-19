package com.github.backyardlab.accountsbook.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.backyardlab.accountsbook.model.Account;
import com.github.backyardlab.accountsbook.model.Commodity;
import com.github.backyardlab.accountsbook.model.User;
import com.github.backyardlab.accountsbook.repository.AccountRepository;
import com.github.backyardlab.accountsbook.repository.CommodityRepository;
import com.github.backyardlab.accountsbook.repository.UserRepository;

@Service
public class AccountsBookService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public User getUser(String name) {
		List<User> users = userRepository.findByName(name);
		if(users == null || users.isEmpty()) {
			return null;
		}
		assert users.size() <= 1;
		return users.get(0);
	}
	
	public List<Account> getAccounts(User user) {
		return accountRepository.findByUser(user);
	}

	public void addCommodity(Commodity commodity) {
		CommodityRepository repo = null;
		repo.save(commodity);
	}
}
