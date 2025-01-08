package com.capx.stockapp.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "history")
public class TransactionEntity {
	
	@Id
	private String symbol;
	private String name;
	private String industry;
	private String action;
	private int price;
	private int quantity;
	private LocalDateTime date;
	public TransactionEntity(String symbol, String name, String industry, String action, int price, int quantity,
			LocalDateTime date) {
		super();
		this.symbol = symbol;
		this.name = name;
		this.industry = industry;
		this.action = action;
		this.price = price;
		this.quantity = quantity;
		this.date = date;
	}
	public TransactionEntity() {
		// TODO Auto-generated constructor stub
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	
	
	
}
