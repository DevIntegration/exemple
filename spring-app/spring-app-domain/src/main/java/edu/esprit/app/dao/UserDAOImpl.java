package edu.esprit.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import edu.esprit.app.entities.User;

@Transactional
public class UserDAOImpl implements IUserDAO{

	@PersistenceContext
	EntityManager em;
	@Override
	public void addUser(User user) {
em.persist(user);		
	}

	@Override
	public void updateUser(User user) {
em.merge(user);		
	}

	@Override
	public void deleteUser(int cin) {
em.remove(findUserByCin(cin));		
	}

	@Override
	public User findUserByCin(int cin) {
		return em.find(User.class, cin);
	}

	@Override
	public List<User> findAllUser() {
		return em.createQuery("select u from User u",User.class)
				.getResultList();
	}

	

	}

