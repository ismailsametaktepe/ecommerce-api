package com.example.ecommerce.business.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductRequest{
   
	@NotBlank
	private String name;
	@Positive
    private double price; 
    @Size(min=13, max= 13)
	private String barcode;
    private String stockCode;
    private String ticket;

    
 

}
