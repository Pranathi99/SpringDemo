package com.examples.SpringORMDemo.dao;

import java.util.List;

import com.examples.SpringORMDemo.entity.Product;

public interface ProductDAO {
	int create(Product product);
	void update(Product product);
	void delete(Product product);
	Product find(int id);
	List<Product>findAll();
}
