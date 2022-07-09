package cl.ejemplo.jpatutorial.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import cl.ejemplo.jpatutorial.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);
}
