package spring.firstproject.mads.repos;

import org.springframework.data.repository.CrudRepository;
import spring.firstproject.mads.domain.Client;

public interface ClientRepo extends CrudRepository<Client,Long> {
}
