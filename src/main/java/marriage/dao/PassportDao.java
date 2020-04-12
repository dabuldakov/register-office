package marriage.dao;

import marriage.domain.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportDao extends JpaRepository <Passport, Long> {
}
