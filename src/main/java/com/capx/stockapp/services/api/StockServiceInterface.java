package com.capx.stockapp.services.api;

import java.util.List;
import java.util.Map;

import com.capx.stockapp.model.Stock;
import com.capx.stockapp.model.TransactionEntity;
import com.capx.stockapp.model.dashboardResponseModel;

public interface StockServiceInterface {
     
    dashboardResponseModel getDashboardData();
    
    List<Stock> getPortfolioData();
    
    List<Stock> addStockToPortfolio(Map<String, Object> requestData);
    
    List<Stock> updateStockData(Map<String, Object> requestData);
    
    List<TransactionEntity> getTransactions();

}
