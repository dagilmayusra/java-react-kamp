package Concrete;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class SalesManager {
	public void gameSales(User user, Game game, Campaign campaign) {
		String discountedPrice = user.getFirstName() + " " + user.getLastName() + " " + game.getGameName() + " " + "oyununu"
				+ " " + "%" + campaign.getDiscount() + " " + "indirimle" + " "
				+ (game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100)) + " "
				+ "TL fiyat�na sat�n ald�.";
		System.out.println(discountedPrice);

	}
}