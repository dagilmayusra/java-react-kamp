package Abstract;

import java.rmi.RemoteException;

import Entities.User;

public interface PersonCheckService {

	boolean CheckIfRealPerson(User user) throws NumberFormatException, RemoteException;

}
