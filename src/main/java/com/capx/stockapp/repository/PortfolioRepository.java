package com.capx.stockapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capx.stockapp.model.StockEntity;

@Repository
public interface PortfolioRepository extends JpaRepository<StockEntity, String> {
	
	 // Define the method to fetch StockEntity by its symbol
    StockEntity findBySymbol(String symbol);
    
}
