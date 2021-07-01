package Concrete;
import Abstract.GamerService;
import Abstract.ValidationService;
import Entites.Gamer;

public class GamerManager implements GamerService {

	ValidationService _validationService;
	
	
	public GamerManager(ValidationService _validationService) {
		super();
		this._validationService = _validationService;
	}

	
	@Override
	public void save(Gamer gamer) {
		if (_validationService.checkIfRealPerson(gamer)) {
		
			System.out.println("Oyuncu kaydedildi : " + gamer.getFirstName());

		} else {
			System.out.println("Not a valid person.");

		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu bilgileri güncellendi : " + gamer.getFirstName());
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi : " + gamer.getFirstName());
	}
	
}
