package CustomerMS.assignment.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import CustomerMS.assignment.entity.Customer;

public interface CustomerDao extends CrudRepository<Customer, String> {

	List<Customer> findByFirstNameInOrLastNameIn(String firstName, String lastName);

}
