package com.example.ecommerce.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.dataAccess.abstracts.ProductRepository;
import com.example.ecommerce.entities.concretes.Product;

@RestController
@RequestMapping("/api/v1/products")
 
public class ProductController {
 private final ProductRepository repo; 
 public ProductController (ProductRepository repo) {
	 this.repo= repo;
 }
 
 @GetMapping("/list")
 public List<Product> getAll(){
	 
	 return repo.findAll();
	  
 }
}

