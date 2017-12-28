package com.mt.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Product {

	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class LambdaComparatorExample {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>();

		// Adding Products
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(3, "Keyboard", 300f));
		list.add(new Product(2, "Dell Mouse", 150f));

		System.out.println("Sorting on the basis of name...");

		// implementing the lambda expression
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});

		for (Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}
		
		  // using lambda to filter data  
		System.out.println("Using Lambada To filter data ...");
        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 200);  
        
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                product -> System.out.println(product.name+": "+product.price)  
        );  

	}

}
