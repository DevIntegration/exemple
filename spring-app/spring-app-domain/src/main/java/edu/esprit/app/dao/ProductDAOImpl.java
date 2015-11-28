package edu.esprit.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import edu.esprit.app.entities.Product;
@Transactional
public class ProductDAOImpl implements IProductDAO {

	@PersistenceContext
	EntityManager em;
	@Override
	public void addProduct(Product p) {

		em.persist(p);
	}

	@Override
	public void deleteProduct(String serialNumber) {
		em.remove(findProductById(serialNumber));
	}

	@Override
	public void updateProduct(Product p) {

       em.merge(p);		
	}

	@Override
	public Product findProductById(String serialNumber) {
		return em.find(Product.class, serialNumber);
	}

	@Override
	public List<Product> findAllProduct() {
		return em.createQuery("select p from Product p",Product.class)
				.getResultList();
	}

}
