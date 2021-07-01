package Concrete;

import Abstract.SaleService;
import Entites.Campaign;
import Entites.Game;
import Entites.Gamer;

public class SaleManager implements SaleService{


	@Override
	public void sale(Game game,Gamer gamer,Campaign campaign) {
		System.out.println(game.getName() + " adlý oyun " + gamer.getFirstName() + " adlý oyuncuya " + game.getPrice()*campaign.getDiscountPercent()/100 + "TL fiyatýnda satýldý.");		
	}

}
