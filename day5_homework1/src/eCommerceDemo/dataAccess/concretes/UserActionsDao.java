package eCommerceDemo.dataAccess.concretes;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.Users;

public class UserActionsDao implements UserDao{

	@Override
	public void signIn(Users user) {
		System.out.println("Adresinize bir mail gönderildi" + user.geteMail());
		
	}

	@Override
	public void logIn(Users user) {
		System.out.println(user.geteMail() + "baþarýlý giriþ");
		
	}

	@Override
	public void delete(Users user) {
		System.out.println(user.geteMail() +" kiþi silindi");
		user.setFirstName(null);
		user.setId(0);
		user.setLastName(null);
		user.seteMail(null);
		user.setPassword(null);
	}

}
