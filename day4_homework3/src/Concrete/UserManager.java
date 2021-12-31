package Concrete;

import java.rmi.RemoteException;

import Abstract.PersonCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {

	private PersonCheckService personCheckService;

	public UserManager(PersonCheckService personCheckService) {
		this.personCheckService=personCheckService;
	}
	
	@Override
	public void add(User user) throws NumberFormatException, RemoteException {
		if(personCheckService.CheckIfRealPerson(user)) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "kayýt oldu.");
		}else {
			System.out.println("hata, mernis sisteminde bulunamadý.");
		}
	}

	@Override
	public void delete(User user) throws NumberFormatException, RemoteException {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "bilgiler silindi.");
	}

	@Override
	public void uptade(User user) throws NumberFormatException, RemoteException {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "bilgiler güncellendi.");
	}

	
}
