package interfaceAbstractDemo1.core.abstracts;

import interfaceAbstractDemo1.entities.concretes.Customer;

public interface CustomerCheckService {

	boolean checkIfRealPerson(Customer customer);
}
