	package hello;
	import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Repository;

//@Repository
public interface CustomerRepository extends MongoRepository<Customer_1, String> {
	public Customer_1 findByFirstName(String firstname);
	public List<Customer_1> findByLastName(String lastName);

}
