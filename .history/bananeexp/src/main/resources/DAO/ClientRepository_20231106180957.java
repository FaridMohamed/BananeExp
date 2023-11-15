package DAO;

import org.springframework.data.jpa.repository.JpaRepository;


@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {

}
