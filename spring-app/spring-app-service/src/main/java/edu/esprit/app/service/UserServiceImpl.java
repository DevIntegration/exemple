package edu.esprit.app.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import edu.esprit.app.dao.IUserDAO;
import edu.esprit.app.entities.User;

@Transactional
public class UserServiceImpl implements IUserService {

	
	private IUserDAO userDAO;
	
	
	
	
	@Override
	public void addUser(User user) {
       userDAO.addUser(user);		
	}

	@Override
	public void updateUser(User user) {
		userDAO.updateUser(user);		
	}

	@Override
	public void deleteUser(int cin) {
		userDAO.deleteUser(cin);		
	}

	@Override
	public User findUserByCin(int cin) {
		return userDAO.findUserByCin(cin);
	}

	@Override
	public List<User> findAllUser() {
		return userDAO.findAllUser();
	}

	@Override
	public Boolean authenticateUser(String firstName, String lastName) {
		// Il ne faut jamais faire ça (récupérer une collection et parcourir. A
				// la place faire une requete SQL dans les DAO.
				// Pour ne pas manipuler encore la couche domain. Nous avons essayé
				// d'implémenter l'authentification de cette façon.
				for (User u : userDAO.findAllUser()) {
					if (u.getFirstName().equals(firstName) && u.getLastName().equals(lastName)) {
						return true;
					}
				}
				return false;
			}

	

	public IUserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
