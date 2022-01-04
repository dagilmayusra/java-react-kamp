package eCommerceDemo.core;

import eCommerceDemo.JGoogle.jGoogleManager;
import eCommerceDemo.entities.concretes.Users;

public class jGoogleManagerAdapter implements GoogleService{

	@Override
	public void signInWithGoogle(Users user) {
		jGoogleManager googleManager = new jGoogleManager();
		googleManager.signIn(user);
		
	}

}
