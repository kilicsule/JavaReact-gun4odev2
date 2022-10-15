package interfaceAbstractDemo1;

import interfaceAbstractDemo1.business.abstracts.BaseCustomerManager;
import interfaceAbstractDemo1.business.concretes.StarbucksCustomerManager;
import interfaceAbstractDemo1.core.concretes.MernisServiceAdapter;
import interfaceAbstractDemo1.dataAccess.concretes.HibernateCustomerDao;
import interfaceAbstractDemo1.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) throws Exception {

		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Şule");
		customer.setLastName("Kılıç");
		customer.setNationalityId("57181365064");
		customer.setDateOfBirth(1997);
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter(), new HibernateCustomerDao());
		customerManager.save(customer);

	}

}
