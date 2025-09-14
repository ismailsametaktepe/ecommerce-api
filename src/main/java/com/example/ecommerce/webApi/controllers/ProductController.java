package com.example.ecommerce.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.business.abstracts.ProductService;
import com.example.ecommerce.business.dtos.request.CreateProductRequest;
import com.example.ecommerce.business.dtos.response.ProductResponse;
import com.example.ecommerce.dataAccess.abstracts.ProductRepository;
import com.example.ecommerce.entities.concretes.Product;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/products")
 
public class ProductController {
 private final ProductService service; 
 public ProductController (ProductService service) {
	 this.service= service;
 }
 @PostMapping
 public ResponseEntity<ProductResponse> create(@Valid @RequestBody 
		 CreateProductRequest req){
	 ProductResponse resp= service.create(req);
	return ResponseEntity.status(HttpStatus.CREATED).body(resp);
	
	 
 }
 
@GetMapping("/List")
public List<ProductResponse> getAll(){
	return service.getAll()
;
	}
}

