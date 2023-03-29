package com.examples.SpringORMDemo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.SpringORMDemo.dao.ProductDAO;
import com.examples.SpringORMDemo.entity.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/SpringORMDemo/springconfig.xml");
    	ProductDAO productDao=(ProductDAO) ctx.getBean("productdao");
    	
//    	create(productDao);
//    	
//    	Product product = update(productDao);
//    	
//    	delete(productDao);
//    	
//    	find(productDao);
//    	
//    	findAll(productDao);
    	
    }

	private static void findAll(ProductDAO productDao) {
		List<Product>prd_list=productDao.findAll();
    	System.out.println(prd_list);
	}

	private static void find(ProductDAO productDao) {
		Product prd=productDao.find(1);
    	System.out.println(prd);
	}

	private static void delete(ProductDAO productDao) {
		Product product=new Product();
    	product.setId(2);
    	product.setName("Mobile");
    	product.setDescription("mobile phone");
    	product.setPrice(35000.00);
    	productDao.delete(product);
    	System.out.println("Product deleted");
	}

	private static Product update(ProductDAO productDao) {
		Product product=new Product();
    	product.setId(2);
    	product.setName("Mobile");
    	product.setDescription("mobile phone");
    	product.setPrice(35000.00);
    	
    	productDao.update(product);
    	System.out.println("Product updated");
		return product;
	}

	private static void create(ProductDAO productDao) {
		Product product=new Product();
    	product.setId(2);
    	product.setName("Mobile");
    	product.setDescription("mobile phone");
    	product.setPrice(45000.58);
    	
    	int result=productDao.create(product);
    	System.out.println("Product created "+result);
	}
}
