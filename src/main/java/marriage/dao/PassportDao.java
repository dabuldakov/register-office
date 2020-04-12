package marriage.dao;

import marriage.domain.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportDao extends JpaRepository <Passport, Long> {
}
