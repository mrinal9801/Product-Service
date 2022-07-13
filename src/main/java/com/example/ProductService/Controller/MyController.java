package com.example.ProductService.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProductService.Service.service;
import com.example.ProductService.entities.product;


@RestController
@RequestMapping ("cart")
public class MyController {
		@Autowired
		public service serve;
		
		@GetMapping("/home")
		public String homeservice()
		{
			return ("Welcome to home");
		}
		
		
		//Get details of all products.
		@GetMapping("/products")
		ResponseEntity<List<product>> GetAllProducts()
		{
			List <product> p = this.serve.GetAllProducts();
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(p);
		}
		
		
		//Get details of a product by its productId
		@GetMapping ("/products/{productId}")
		public product getproduct(@PathVariable String productId)
		{
			return this.serve.getproduct(Long.parseLong(productId));
		}
		
		
		//Add a json file with the details of product to be added in postman post->body->raw.
		//(P.s, file attached at /src/main/java/com.example.ProductService.entities.addproduct.json)
		
		@PostMapping("/products")
		public product addproduct(@RequestBody product p)
		{
			return this.serve.addproduct(p);
		}
		
		//Delete a product from the product list
		@DeleteMapping ("/products/{productId}")
		public void deleteproduct(@PathVariable("productId") int productId)
		{
			this.serve.deleteproduct(productId);
		}
		
		//Update a product in the product list
		@PutMapping ("/products/{productId}")
		public void updateproduct(@RequestBody product pro,@PathVariable ("productId") int productId)
		{
			this.serve.updateproduct(pro,productId);
		}
}
