import Abstract.ValidationService;
import Adapters.MernisServiceAdapter;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entites.Campaign;
import Entites.Game;
import Entites.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Game game1 = new Game();
		game1.setName("CraftRise");
		game1.setPrice(50);
		
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Muhammet Emin");
		gamer1.setLastName("Çaðlar");
		gamer1.setDateTime(2006);
		gamer1.setNationalityIdentity("111111111111");
		
		Campaign campaign1 = new Campaign();
		campaign1.setName("Yaz indirimi");
		campaign1.setDiscountPercent(40);
		
		
		
		GamerManager gamerManager= new GamerManager(new MernisServiceAdapter());
		gamerManager.save(gamer1);
		gamerManager.delete(gamer1);
		gamerManager.update(gamer1);
		
		
		SaleManager manager = new SaleManager();
		manager.sale(game1, gamer1, campaign1);
	}

	
	

}
