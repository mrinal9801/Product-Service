package com.example.ProductService.Service;

import java.util.List;

import com.example.ProductService.entities.product;


public interface service {
	
	public List <product> GetAllProducts();
	public product getproduct(long productId);
	public product addproduct(product p);
	public void deleteproduct(int productId);
	public void updateproduct(product pro, int productId);
	
	
}
