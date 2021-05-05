package coffeeShop;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub

		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			result = kpsPublic.TCKimlikNoDogrula(
					Long.parseLong(
					customer.getNatiolnalityId()), 
					customer.getFirstName().toUpperCase(),			
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth()
					);

		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return result;
	}

}
