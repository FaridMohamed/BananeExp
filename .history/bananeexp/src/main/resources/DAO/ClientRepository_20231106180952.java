package DAO;

import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryR
public interface ClientRepository extends JpaRepository<Client, Long> {

}
