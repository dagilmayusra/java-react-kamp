package eCommerceDemo.dataAccess.abstracts;

import eCommerceDemo.entities.concretes.Users;

public interface UserDao {

	void signIn(Users user);
	void logIn(Users user);
	void delete(Users user);
}
