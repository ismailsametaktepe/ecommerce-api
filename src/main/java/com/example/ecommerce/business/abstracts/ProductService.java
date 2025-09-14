package com.example.ecommerce.business.abstracts;

import java.util.List;

import com.example.ecommerce.business.dtos.request.CreateProductRequest;
import com.example.ecommerce.business.dtos.response.ProductResponse;

public interface ProductService {
	List<ProductResponse> getAll();
	ProductResponse create (CreateProductRequest request);

}
