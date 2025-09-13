package com.example.ecommerce.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.entities.concretes.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
	boolean existsByBarcode(String barcode);

	

}
