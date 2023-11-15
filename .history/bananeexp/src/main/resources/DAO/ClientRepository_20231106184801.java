package DAO;

import org.springframework.data.jpa.repository.JpaRepository;

@Repo
public interface ClientRepository extends JpaRepository<Client, Long>{
    
}
