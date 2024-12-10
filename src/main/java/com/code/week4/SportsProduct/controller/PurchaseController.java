package com.code.week4.SportsProduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.week4.SportsProduct.entity.Purchase;
import com.code.week4.SportsProduct.repo.PurchaseRepo;

@RestController
@RequestMapping

public class PurchaseController {
	
	@Autowired
	private PurchaseRepo purchaseRepo;
	
	@GetMapping("/getPurchase")
	public List<Purchase> getPurchases() {
		return purchaseRepo.findAll();
	}
	
	@PostMapping("/addPurchase")
	public Purchase addPurchase(@RequestBody Purchase purchase) {
		return purchaseRepo.save(purchase);
	}
	
	@DeleteMapping("/deletePurchase/{id}")
	public void deletePurchase (@PathVariable Long id) {
		
		purchaseRepo.deleteById(id);
	}

}
