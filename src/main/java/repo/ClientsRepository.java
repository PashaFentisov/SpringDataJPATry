package repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pojo.Address;
import pojo.Clients;

@Repository
public interface ClientsRepository extends CrudRepository<Clients, Integer> {
    @Query("select a from Clients a join fetch a.address where a.id = :id")
    public Clients findObjById(@Param("id") int id);
}
