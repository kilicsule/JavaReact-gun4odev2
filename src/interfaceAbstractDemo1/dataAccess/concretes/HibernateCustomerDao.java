package interfaceAbstractDemo1.dataAccess.concretes;

import interfaceAbstractDemo1.dataAccess.abstracts.CustomerDao;
import interfaceAbstractDemo1.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {

	@Override
	public void save(Customer customer) {
		
		System.out.println("Hibernate ile kayıt yapıldı: " + customer.getFirstName());
		
	}

}
