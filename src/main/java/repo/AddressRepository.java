package repo;

import org.springframework.data.repository.CrudRepository;
import pojo.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {
}
