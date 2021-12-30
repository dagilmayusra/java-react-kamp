import java.rmi.RemoteException;


import Adapters.MernisServiceAdapter;
import Abstract.BaseCustomerManager;

import Concrete.StarbucksCustomerManager;
import Entities.Customer;
;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());

		customerManager.save(new Customer(1, "YÜSRA", "DAÐILMA", 1997, "00000000000"));
	
	}

}
