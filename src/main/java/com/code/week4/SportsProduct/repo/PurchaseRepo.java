package com.code.week4.SportsProduct.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.code.week4.SportsProduct.entity.Purchase;

public interface PurchaseRepo extends JpaRepository<Purchase, Long> {
} 
