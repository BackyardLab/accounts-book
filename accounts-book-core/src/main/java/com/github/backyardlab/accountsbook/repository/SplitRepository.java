package com.github.backyardlab.accountsbook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.backyardlab.accountsbook.model.Account;
import com.github.backyardlab.accountsbook.model.Split;

public interface SplitRepository extends JpaRepository<Split, String> {

	List<Split> findByAccount(Account account);
	
}
