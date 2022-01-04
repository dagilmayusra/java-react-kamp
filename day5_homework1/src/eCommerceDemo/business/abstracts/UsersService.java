package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.Users;

public interface UsersService {

	void signIn(Users user);
	void logIn(Users user);
	void signInWithGoogle(Users user);
	boolean mailVerification(Users user);
	boolean passwordVerification(Users user);
	void delete(Users user);
	boolean nameVerification(Users user);
}
