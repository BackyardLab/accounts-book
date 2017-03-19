package com.github.backyardlab.accountsbook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.backyardlab.accountsbook.model.Commodity;
import com.github.backyardlab.accountsbook.model.User;

public interface CommodityRepository extends JpaRepository<Commodity, String> {

    List<Commodity> findByName(String name);

    List<Commodity> findByUser(User user);
    
}
