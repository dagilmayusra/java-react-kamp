package Abstract;

import java.rmi.RemoteException;

import Entities.Game;
import Entities.User;

public interface GameService {

	void add(Game game);
	void delete(Game game);
	void uptade(Game game);
	
}
