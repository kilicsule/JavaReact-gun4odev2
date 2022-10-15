package interfaceAbstractDemo1.business.concretes;


import interfaceAbstractDemo1.business.abstracts.BaseCustomerManager;
import interfaceAbstractDemo1.core.abstracts.CustomerCheckService;
import interfaceAbstractDemo1.dataAccess.abstracts.CustomerDao;
import interfaceAbstractDemo1.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	private CustomerDao customerDao;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService, CustomerDao customerDao) {
		this.customerCheckService = customerCheckService;
		this.customerDao = customerDao;
	}
	
	@Override
	public void save(Customer customer) throws Exception {
		if(customerCheckService.checkIfRealPerson(customer)) {
			customerDao.save(customer);
		}else {
			throw new Exception("Bilgiler yanlış. Kayıt yapılamadı");
		}
		
	}
}
