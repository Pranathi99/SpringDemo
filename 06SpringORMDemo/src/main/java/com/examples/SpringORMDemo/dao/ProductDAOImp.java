package com.examples.SpringORMDemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.examples.SpringORMDemo.entity.Product;

@Component("productdao")
public class ProductDAOImp implements ProductDAO {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Product product) {
		Integer result=(Integer) hibernateTemplate.save(product);
		return result;
	}

	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	@Override
	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}

	@Override
	public Product find(int id) {
		Product prd=hibernateTemplate.get(Product.class, id);
		return prd;
	}

	@Override
	public List<Product> findAll() {
		List<Product>prd_list=hibernateTemplate.loadAll(Product.class);
		return prd_list;
	}

	
		
}
