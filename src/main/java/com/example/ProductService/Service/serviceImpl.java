/**
 * 
 */
package com.example.ProductService.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.ProductService.Exceptions.productNotFoundException;
import com.example.ProductService.entities.product;

@Service
public class serviceImpl implements service {
	List<product> list;
	public serviceImpl() {
		list =new ArrayList<>();
		list.add(new product(298,49999,"Mobile","Electronics"));
		list.add(new product(650,980,"Slipper","Footwear"));
		list.add(new product(445,3899,"Jeans","Fashion"));
		list.add(new product(863,1200,"Screwdriver","Hardware"));
	}

	
	@Override
	public product getproduct(long productId) {
		product p= null;
		for(product pro :list)        //
		{
			if(pro.getProductId()== productId)
			{
				p=pro;
				break;
			}
		}
		return p;
	}
	
	@Override
	public product addproduct(product p) {
		list.add(p);
		return p;
	}

	@Override
	public void deleteproduct(int productId) {
		list=list.stream().filter(product->product.getProductId()!=productId).collect(Collectors.toList());
	}

	@Override
	public void updateproduct(product pro, int productId) throws productNotFoundException {
		list=list.stream().map(p ->{
			if(p.getProductId()==productId)
			{
				p.setProductPrice(pro.getProductPrice());
				p.setProductName(pro.getProductName());
				p.setCategoryName(pro.getCategoryName());
			}
			return p;
		}).collect(Collectors.toList());
		if(list==null)
		{
			throw new productNotFoundException("Product not found","404");
		}
	}

	@Override
	public List <product> GetAllProducts() {
		
		return list;
	}



	
}
