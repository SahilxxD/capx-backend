package com.capx.stockapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.time.LocalDateTime;

@Entity
@Table(name = "portfolio")
public class StockEntity {

    @Id
    private String symbol;
    private String name;
    private String industry;
    private int avgOrder;
    private int quantity;

    @Column(name = "purchased_on")
    private LocalDateTime purchasedOn;

    @Column(name = "modified_on")
    private LocalDateTime modifiedOn;

    public StockEntity() {
        // Default constructor
    }

    public StockEntity(String symbol, String name, String industry, int avgOrder, int quantity, LocalDateTime purchasedOn, LocalDateTime modifiedOn) {
        this.symbol = symbol;
        this.name = name;
        this.industry = industry;
        this.avgOrder = avgOrder;
        this.quantity = quantity;
        this.purchasedOn = purchasedOn;
        this.modifiedOn = modifiedOn;
    }

    // Getters and setters for all fields

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

    public int getAvgOrder() {
        return avgOrder;
    }

    public void setAvgOrder(int avgOrder) {
        this.avgOrder = avgOrder;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getPurchasedOn() {
        return purchasedOn;
    }

    public void setPurchasedOn(LocalDateTime purchasedOn) {
        this.purchasedOn = purchasedOn;
    }

    public LocalDateTime getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(LocalDateTime modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
}
