package marriage.dao;

import marriage.domain.Person;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Component
public class PersonDao {


    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> findPersons(){
        Query query = entityManager.createNamedQuery("getPersons");
        return query.getResultList();
    }

    public Long addPerson(Person person){

            entityManager.persist(person);
            entityManager.flush();

        return person.getPersonId();
    }
}
