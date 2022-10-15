package interfaceAbstractDemo1.business.abstracts;

import interfaceAbstractDemo1.entities.concretes.Customer;

public interface CustomerService {

	public void save(Customer customer) throws Exception;
	
}
