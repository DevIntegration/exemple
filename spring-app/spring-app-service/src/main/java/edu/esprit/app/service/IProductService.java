package edu.esprit.app.service;

import java.util.List;

import edu.esprit.app.entities.Product;

public interface IProductService {
	

	public abstract void addProduct(Product p);
	public abstract void deleteProduct(String serialNumber);
	public abstract void updateProduct(Product p);
	public abstract Product findProductById(String serialNumber);
	public abstract List<Product> findAllProduct();

}
