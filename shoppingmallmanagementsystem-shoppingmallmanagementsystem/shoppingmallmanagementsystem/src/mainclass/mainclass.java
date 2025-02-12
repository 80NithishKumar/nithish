package com.mall.main;

	import com.mall.admin.Admin;
	import com.mall.model.Store;
	import com.mall.model.Product;
	import com.mall.model.Customer;

	public class Main {
	    public static void main(String[] args) {
	        Admin admin = new Admin();

	        // Creating Store
	        Store store1 = new Store(1, "Tech World", "1st Floor", "Electronics");
	        admin.addStore(store1);

	        // Creating Product
	        Product product1 = new Product(1, "Laptop", 1000.00, 1);
	        admin.addProduct(product1);

	        // Creating Customer
	        Customer customer1 = new Customer(1, "John Doe", "john@example.com", "1234567890");
	        admin.addCustomer(customer1);

	        // Viewing stores, products, and customers
	        System.out.println("\nStores:");
	        admin.viewStores();
	        System.out.println("\nProducts:");
	        admin.viewCustomers();
	        System.out.println("\nCustomers:");
	        admin.viewCustomers();
	    }
	}