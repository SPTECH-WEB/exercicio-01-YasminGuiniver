package atividadeGit.faturas.repository;

import atividadeGit.faturas.model.faturaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface faturaRepository extends JpaRepository<faturaModel, Long> {
    Long id(Long id);
}