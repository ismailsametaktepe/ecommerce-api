package com.example.ecommerce.business.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {
	
	private long id;
	private String name;
	private double price;
	private String barcode;
	private String stockCode;
	
	

}
