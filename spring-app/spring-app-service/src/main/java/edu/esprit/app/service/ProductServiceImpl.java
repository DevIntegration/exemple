package edu.esprit.app.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import edu.esprit.app.dao.IProductDAO;
import edu.esprit.app.entities.Product;

@Transactional
public class ProductServiceImpl implements IProductService{

	private IProductDAO productDAO;

	@Override
	public void addProduct(Product p) {
		productDAO.addProduct(p);		
	}

	@Override
	public void deleteProduct(String serialNumber) {
		productDAO.deleteProduct(serialNumber);		
	}

	@Override
	public void updateProduct(Product p) {
		productDAO.updateProduct(p);		
	}

	@Override
	public Product findProductById(String serialNumber) {
		return productDAO.findProductById(serialNumber);
	}

	@Override
	public List<Product> findAllProduct() {
		return productDAO.findAllProduct();
	}

	

	public void setProductDAO(IProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	
	

	

}
