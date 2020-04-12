package marriage.business;

import marriage.dao.MarriageDao;
import marriage.dao.PassportDao;
import marriage.dao.PersonDao;
import marriage.domain.*;
import marriage.view.MarriageRequest;
import marriage.view.MarriageResponse;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("marriageService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MarriageManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarriageManager.class);

    @Autowired
    private MarriageDao marriagedao;
    @Autowired
    private PersonDao personDao;
    @Autowired
    private PassportDao passportDao;

    @Transactional()
    public MarriageResponse findMarriageCertificate(MarriageRequest request){
        LOGGER.info("findMarriageCertificate called");


        Person female = getPerson(1);
        Person male = getPerson(2);

        getPassport(female);
        getPassport(male);

        MarriageCertificate mc = getMarriageCertificate(female, male);
        marriagedao.saveAndFlush(mc);

        List<MarriageCertificate> list = marriagedao.findAll();
        list.forEach(i -> LOGGER.info("Id: {} Number: {}", i.getMarriageCertificateId(), i.getNumber()));

        LOGGER.info("-------------");

        return new MarriageResponse();
    }

    public void getPassport(Person person) {

        Passport passport = new Passport();
        passport.setIssueDepartment("ROVD Leninskoe");
        passport.setIssuerDate(LocalDate.now());
        passport.setSeria("6905");
        passport.setNumber("113111");
        passport.setPerson(person);

        Passport passport1 = passportDao.saveAndFlush(passport);
        LOGGER.info("passport id: " + passport1.getPassportId());

    }

    public Person getPerson(int sex) {

        final Logger LOGGER = LoggerFactory.getLogger(MarriageManager.class);

        Person person = sex == 2 ? new PersonMale() : new PersonFemale();
        person.setFirstName("a_" + sex);
        person.setLastName("b_" + sex);
        person.setPatronymicName("c_" + sex);
        person.setDateOfBirth(LocalDate.of(2007,11,6));

        Person person1 = personDao.saveAndFlush(person);
        LOGGER.info("person id: " + person1.getPersonId());

        return person1;
    }

    public MarriageCertificate getMarriageCertificate(Person female, Person male){

        MarriageCertificate mc = new MarriageCertificate();
        mc.setActive(true);
        mc.setNumber("zzz");
        mc.setIssueDate(LocalDate.now());
        mc.setWife((PersonFemale) female);
        mc.setHusband((PersonMale) male);
        /*List<Person> all = personDao.findAll();

        for (Person person : all) {
            if (person instanceof PersonFemale)
                mc.setWife((PersonFemale) person);
            else
                mc.setHusband((PersonMale) person);

        }*/

        //Optional<Person> person1 = personDao.findById(female.getPersonId());
      //  person1.ifPresent(person -> mc.setWife((PersonFemale) person));

       // Optional<Person> person2 = personDao.findById(male.getPersonId());
       // person2.ifPresent(value -> mc.setHusband((PersonMale) value));

        return mc;

    }
}
