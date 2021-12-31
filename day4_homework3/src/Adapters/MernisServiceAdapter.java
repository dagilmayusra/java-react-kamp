package Adapters;

import java.rmi.RemoteException;

import Abstract.PersonCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService {
	KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

	@Override
	public boolean CheckIfRealPerson(User user) throws NumberFormatException, RemoteException {
		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(user.getIdentityNo()), user.getFirstName(),
				user.getLastName(), user.getDateOfBirth());
		if (result == true) {
			System.out.println("Giri� Ba�ar�l�");
			return true;
		} else {
			System.out.println("Giri� Ba�ar�s�z");
			return false;
		}
	}

}
