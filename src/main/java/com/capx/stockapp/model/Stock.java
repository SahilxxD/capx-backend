package com.capx.stockapp.model;

import java.util.List;

public class Stock {
    private String symbol;
    private String name;
    private List<List<Object>> closePricesWithTimestamps;
    private Integer avgOrderPrice;
    private Double change;
    private Integer currentPrice;
    private Integer quantity;
    private String industry;
    
	public Stock(String symbol, String name, List<List<Object>> closePricesWithTimestamps, Integer avgOrderPrice,
			Double change, Integer currentPrice, Integer qunatity, String industry) {
		super();
		this.symbol = symbol;
		this.name = name;
		this.closePricesWithTimestamps = closePricesWithTimestamps;
		this.avgOrderPrice = avgOrderPrice;
		this.change = change;
		this.currentPrice = currentPrice;
		this.quantity = qunatity;
		this.industry = industry;
	}
	public Stock() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
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
	public List<List<Object>> getClosePricesWithTimestamps() {
		return closePricesWithTimestamps;
	}
	public void setClosePricesWithTimestamps(List<List<Object>> closePricesWithTimestamps) {
		this.closePricesWithTimestamps = closePricesWithTimestamps;
	}
	public Integer getAvgOrderPrice() {
		return avgOrderPrice;
	}
	public void setAvgOrderPrice(Integer avgOrderPrice) {
		this.avgOrderPrice = avgOrderPrice;
	}
	public Double getChange() {
		return change;
	}
	public void setChange(Double change) {
		this.change = change;
	}
	public Integer getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(Integer currentPrice) {
		this.currentPrice = currentPrice;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer qunatity) {
		this.quantity = qunatity;
	}
    
   
}