package com.github.backyardlab.accountsbook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String uuid;
	
	@ManyToOne
	private Commodity currency;
	
	private long postDate;
	
	private long enterDate;
	
	private String description;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Commodity getCurrency() {
		return currency;
	}

	public void setCurrency(Commodity currency) {
		this.currency = currency;
	}

	public long getPostDate() {
		return postDate;
	}

	public void setPostDate(long postDate) {
		this.postDate = postDate;
	}

	public long getEnterDate() {
		return enterDate;
	}

	public void setEnterDate(long enterDate) {
		this.enterDate = enterDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
