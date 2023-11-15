package DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.bananeexp.entities.Cl;
public interface ClientRepository extends JpaRepository<Client, Long> {

}
