package Concrete;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

}
