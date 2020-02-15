package com.code.java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService{
	
	//Repo Class
	@Autowired
	private ProductRepository repo;
	
	//Find all - returns List of objects
	public List<Product> listAll(){
		return repo.findAll();
	}
	
	//Save a product - returns void
	public void save(Product product) {
		repo.save(product);
	}
	
	//Get one product - returns 1 object
	public Product get(Integer id) {
		return repo.findById(id).get();
	}
	
	//Delete product - returns void
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
