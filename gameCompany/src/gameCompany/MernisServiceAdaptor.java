package gameCompany;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements ICustomerCheckService {

	@Override
	public boolean checkIfrealPerson(Customer customer) {
		
		
				KPSPublicSoapProxy buyer = new KPSPublicSoapProxy();
				boolean result = true;
				
				try {
					result = buyer.TCKimlikNoDogrula(
							Long.parseLong(
							customer.getNationalityNumber()), 
							customer.getFirstName().toUpperCase(),			
							customer.getLastName().toUpperCase(), 
							customer.getDateOfBirth()
							);
				}catch(RemoteException e) {
					e.printStackTrace();
				}
		return result;
	}

}
