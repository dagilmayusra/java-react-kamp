import java.rmi.RemoteException;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SalesManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		//gercek degerler buraya gýrýlýr
		User user1 = new User (1, "Yüsra", "Daðýlma", 1997, "00000000");
		
		Game game1 = new Game (1, "Fire Emblem", 1000);
	
		Campaign campaign1 = new Campaign (1, "Yýlbaþý kampanyasý", 30);
		
		GameManager gameManager= new GameManager();
		gameManager.add(game1);
		
		CampaignManager campaignManager= new CampaignManager();
		campaignManager.add(campaign1);
		
		SalesManager salesManager = new SalesManager();
		salesManager.gameSales(user1, game1, campaign1);
		
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.add(user1);
	}

}
