package Adapters;
import java.rmi.RemoteException;

import Abstract.ValidationService;
import Entites.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ValidationService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result=true;
		try {
		result=client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityIdentity()), 
					gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(),
					gamer.getDateTime());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}
     
	
}
