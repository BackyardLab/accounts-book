package com.github.backyardlab.accountsbook;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.backyardlab.accountsbook.config.ApplicationConfiguration;
import com.github.backyardlab.accountsbook.model.Commodity;
import com.github.backyardlab.accountsbook.repository.CommodityRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
public class CommodityRepositoryTest {

	@Autowired
	CommodityRepository commodityRepository;
	
	@Test
	public void test() {
		Commodity commodity = new Commodity();
		commodity.setName("INR");
		commodity.setSymbol("INR");
		commodity.setType("Currency");
		commodity.setUser(null);
		commodity = commodityRepository.save(commodity);
		assertTrue(commodity.getUuid() != null);
		
		Commodity commodity2 = new Commodity();
		commodity2.setName("USD");
		commodity2.setSymbol("$");
		commodity2.setType("Currency");
		commodity2.setUser(null);
		commodity2 = commodityRepository.save(commodity2);
		assertTrue(commodity2.getUuid() != null);
		
		List<Commodity> commodities = commodityRepository.findAll();
		for(Commodity c : commodities) {
			assertTrue(c.getName().equals("INR") || c.getName().equals("USD"));
		}
	}
}
