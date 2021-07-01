package Concrete;

import Abstract.GameService;
import Abstract.GamerService;
import Entites.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi : " + game.getName());		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi : " + game.getName());		
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi : " + game.getName());		
		
	}
	
	
	

}
