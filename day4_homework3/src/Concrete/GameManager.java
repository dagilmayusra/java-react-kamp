package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " " + game.getPrice() +  " eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " " + game.getPrice() +  " silindi");
		
	}

	@Override
	public void uptade(Game game) {
		System.out.println(game.getGameName() + " " + game.getPrice() +  " g�ncellendi");
		
	}

	
}
