package com.github.backyardlab.accountsbook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Split {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String uuid;
	
	@ManyToOne
	private Transaction transaction;
	
	@ManyToOne
	private Account account;
	
	private String memo;
	
	private boolean reconciliationState;
	
	private long reconciliationTimestamp;
	
	private long valueNum;
	
	private long valueDenom;
	
	private long quantityNum;
	
	private long quantityDenom;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public boolean isReconciliationState() {
		return reconciliationState;
	}

	public void setReconciliationState(boolean reconciliationState) {
		this.reconciliationState = reconciliationState;
	}

	public long getReconciliationTimestamp() {
		return reconciliationTimestamp;
	}

	public void setReconciliationTimestamp(long reconciliationTimestamp) {
		this.reconciliationTimestamp = reconciliationTimestamp;
	}

	public long getValueNum() {
		return valueNum;
	}

	public void setValueNum(long valueNum) {
		this.valueNum = valueNum;
	}

	public long getValueDenom() {
		return valueDenom;
	}

	public void setValueDenom(long valueDenom) {
		this.valueDenom = valueDenom;
	}

	public long getQuantityNum() {
		return quantityNum;
	}

	public void setQuantityNum(long quantityNum) {
		this.quantityNum = quantityNum;
	}

	public long getQuantityDenom() {
		return quantityDenom;
	}

	public void setQuantityDenom(long quantityDenom) {
		this.quantityDenom = quantityDenom;
	}
}
