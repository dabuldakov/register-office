package marriage.business;

import marriage.dao.MarriageDao;
import marriage.dao.PersonDao;
import marriage.domain.MarriageCertificate;
import marriage.domain.Person;
import marriage.domain.PersonFemale;
import marriage.domain.PersonMale;
import marriage.view.MarriageRequest;
import marriage.view.MarriageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service("marriageService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MarriageManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarriageManager.class);

    @Autowired
    private MarriageDao marriagedao;
    @Autowired
    private PersonDao personDao;


    @Transactional()
    public MarriageResponse findMarriageCertificate(MarriageRequest request){
        LOGGER.info("findMarriageCertificate called");


        getPerson(1);
        getPerson(2);

        MarriageCertificate mc = getMarriageCertificate();
        marriagedao.saveAndFlush(mc);


        return new MarriageResponse();
    }

    public void getPerson(int sex) {

        final Logger LOGGER = LoggerFactory.getLogger(MarriageManager.class);

        Person person = sex == 1 ? new PersonMale() : new PersonFemale();
        person.setFirstName("a_" + sex);
        person.setLastName("b_" + sex);
        person.setPatronymicName("c_" + sex);
        person.setDateOfBirth(LocalDate.of(2007,11,6));

        Long id = personDao.addPerson(person);
        LOGGER.info("person id: " + id);

    }

    public MarriageCertificate getMarriageCertificate(){

        MarriageCertificate mc = new MarriageCertificate();
        mc.setActive(true);
        mc.setNumber("asd222");
        mc.setIssueDate(LocalDate.now());

        List<Person> personList = personDao.findPersons();
        for (Person person : personList){
            if(person instanceof PersonMale)
                mc.setHusband((PersonMale) person);
            else
                mc.setWife((PersonFemale) person);
        }

        return mc;

    }
}
