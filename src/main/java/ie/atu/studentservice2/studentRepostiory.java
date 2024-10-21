package ie.atu.studentservice2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepostiory extends JpaRepository <student, String> {
}
