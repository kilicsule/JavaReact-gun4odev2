package interfaceAbstractDemo1.core.concretes;

import interfaceAbstractDemo1.core.abstracts.CustomerCheckService;
import interfaceAbstractDemo1.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
		
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
					customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth());
					//customer.getDateOfBirth().getYear()
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;

	}
}
