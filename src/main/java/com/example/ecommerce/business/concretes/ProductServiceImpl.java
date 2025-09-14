package com.example.ecommerce.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ecommerce.business.abstracts.ProductService;
import com.example.ecommerce.business.dtos.request.CreateProductRequest;
import com.example.ecommerce.business.dtos.response.ProductResponse;
import com.example.ecommerce.business.exceptions.BusinessException;
import com.example.ecommerce.dataAccess.abstracts.ProductRepository;
import com.example.ecommerce.entities.concretes.Product;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
	private final ProductRepository repo;

	

	@Override
	public ProductResponse create(CreateProductRequest request) {
		// TODO Auto-generated method stub
		
		//barkod unique olmalı dikkat!
		if (repo.existsByBarcode(request.getBarcode())) {
			throw new BusinessException (
					"PRODUCT_BARCODE_EXISTS" ,"Barkod zaten kullanımda");
			
		}		
		
		Product p = new Product();
		p.setName(request.getName());
        p.setPrice(request.getPrice());
        p.setBarcode(request.getBarcode());
        p.setStockCode(request.getStockCode());
	    p.setTicket(request.getTicket()); // response da gözükmüyor 
	   Product saved = repo.save(p);
	   
	   return new ProductResponse(saved.getId(),
			   saved.getName(),
			   saved.getPrice(),
			   saved.getBarcode(),
			   saved.getStockCode()
			);   
	}


	@Override
	public List<ProductResponse> getAll() {
		   List<Product> products = repo.findAll();
		  return  products.stream().map(p->new ProductResponse(
				  p.getId(),
				  p.getName(),
				   p.getPrice(),
				   p.getBarcode(),
				   p.getStockCode()
				   )).toList();	}

}
