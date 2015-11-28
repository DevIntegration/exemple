package edu.esprit.app.service;

import java.util.List;

import edu.esprit.app.entities.User;

public interface IUserService {
	

	public abstract void addUser(User user);
	public abstract void updateUser(User user);
	public abstract void deleteUser(int cin);
	public abstract User findUserByCin(int cin);
	public abstract List<User> findAllUser();
	public abstract Boolean authenticateUser(String firstName,String lastName);

}
