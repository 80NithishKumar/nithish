package com.mall.admin;

	import com.mall.model.Store;
	import com.mall.model.Product;
	import com.mall.model.Customer;

	import java.util.ArrayList;
	import java.util.List;

	public class Admin {

	    private List<Store> storeList = new ArrayList<>();
	    private List<Product> productList = new ArrayList<>();
	    private List<Customer> customerList = new ArrayList<>();

	    // Add Store
	    public void addStore(Store store) {
	        storeList.add(store);
	        System.out.println("Store added: " + store.getStoreName());
	    }

	    // Remove Store
	    public void removeStore(int storeId) {
	        storeList.removeIf(store -> store.getStoreId() == storeId);
	        System.out.println("Store with ID " + storeId + " removed.");
	    }

	    // View Stores
	    public void viewStores() {
	        for (Store store : storeList) {
	            System.out.println("Store ID: " + store.getStoreId() + ", Name: " + store.getStoreName() + ", Category: " + store.getCategory());
	        }
	    }

	    // Add Product
	    public void addProduct(Product product) {
	        productList.add(product);
	        System.out.println("Product added: " + product.getProductName());
	    }

	    // Remove Product
	    public void removeProduct(int productId) {
	        productList.removeIf(product -> product.getProductId() == productId);
	        System.out.println("Product with ID " + productId + " removed.");
	    }

	    // Add Customer
	    public void addCustomer(Customer customer) {
	        customerList.add(customer);
	        System.out.println("Customer added: " + customer.getCustomerName());
	    }

	    // View Customers
	    public void viewCustomers() {
	        for (Customer customer : customerList) {
	            System.out.println("Customer ID: " + customer.getCustomerId() + ", Name: " + customer.getCustomerName());
	        }
	    }
	}