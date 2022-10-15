package interfaceAbstractDemo1.business.abstracts;

import interfaceAbstractDemo1.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {
	
	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Saved to db: " + customer.getFirstName());
	}
}
