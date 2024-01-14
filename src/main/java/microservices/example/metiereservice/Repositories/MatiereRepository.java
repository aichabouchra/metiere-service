package microservices.example.metiereservice.Repositories;

import microservices.example.metiereservice.Entities.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatiereRepository extends JpaRepository<Matiere, Long> {
}
