package edu.esprit.app.dao;

import java.util.List;

import edu.esprit.app.entities.User;

public interface IUserDAO {

	public abstract void addUser(User user);
	public abstract void updateUser(User user);
	public abstract void deleteUser(int cin);
	public abstract User findUserByCin(int cin);
	public abstract List<User> findAllUser();
}
