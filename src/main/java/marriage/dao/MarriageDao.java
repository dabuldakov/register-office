package marriage.dao;

import marriage.domain.MarriageCertificate;
import marriage.domain.PersonMale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public interface MarriageDao extends JpaRepository<MarriageCertificate, Long> {

    @Query("select p from MarriageCertificate p where p.number = :number")
    List<MarriageCertificate> findByNumber (@Param("number") String number);

}
