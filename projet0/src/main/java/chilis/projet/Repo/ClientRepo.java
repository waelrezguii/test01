package chilis.projet.Repo;

import chilis.projet.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface ClientRepo extends JpaRepository<Client,Integer> {
    Optional<Client> findOneByEmailAndMdp(String email, String mdp);
    Client findByEmail(String email);
}
