package eCommerceDemo;

import eCommerceDemo.entities.concretes.Users;
import eCommerceDemo.core.jGoogleManagerAdapter;
import eCommerceDemo.business.concretes.UsersManager;
import eCommerceDemo.business.abstracts.UsersService;
import eCommerceDemo.dataAccess.concretes.*;

public class Main {

	public static void main(String[] args) {
		UsersService userService= new UsersManager(new UserActionsDao(),new jGoogleManagerAdapter());
		Users yuss1 = new Users(1,"yusra","daðýlma","deneme1@gmail.com","5pO115-");
		Users yuss2 = new Users(1,"yusra","daðýlma","deneme2@gmail.com","5p9115-");
		Users yuss3 = new Users(1,"yusra","daðýlma","deneme3@hotmail.com","5p8315-");
		Users yuss4 = new Users(1,"yusra","daðýlma","deneme4@gmail.com","123144");
		Users yuss5 = new Users(1,"yusra","daðýlma","deneme5@gmail.com","1Ab-");
		Users yuss6 = new Users(1,"a","bb","deneme6@gmail.com","5p8315-");

		userService.signIn(yuss1);
		userService.signInWithGoogle(yuss2);
		userService.signInWithGoogle(yuss3);
		userService.logIn(yuss1);
		userService.logIn(yuss2);
		userService.logIn(yuss3);
		
		userService.delete(yuss2);
		userService.logIn(yuss2);
		
		userService.signIn(yuss4);
		userService.signIn(yuss5);
		userService.signIn(yuss6);

	}

}
