package com.github.backyardlab.accountsbook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.backyardlab.accountsbook.model.Account;
import com.github.backyardlab.accountsbook.model.User;

public interface AccountRepository extends JpaRepository<Account, String> {

    List<Account> findByName(String name);
    
    List<Account> findByUser(User user);

}
