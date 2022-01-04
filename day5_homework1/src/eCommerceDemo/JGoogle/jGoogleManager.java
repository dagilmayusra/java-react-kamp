package eCommerceDemo.JGoogle;

import eCommerceDemo.entities.concretes.Users;

public class jGoogleManager {

	public void signIn(Users user) {
		System.out.println(user.getFirstName()+ " google hesabýyla oturum açýldý");
	}
}
