package dao;

import marriage.dao.PersonDao;
import marriage.domain.Person;
import org.junit.Test;

import java.util.List;

public class PersonDaoTest {

    PersonDao personDao;

    @Test
    public void findPerson() {


       // List<Person> persons = personDao.findAll();

       // persons.forEach(p -> {
        //    System.out.println("Name: " + p.getFirstName());
       //     System.out.println("Class of: " + p.getClass().getName());
      //      System.out.println("Passport: " + p.getPassports().size());
      //      System.out.println("Birth cert: " + p.getBirthCertificate());
            /*if (p instanceof PersonMale){
                System.out.println("Birth cert: " + ((PersonMale) p).getBirthCertificates().size() );
                System.out.println("Marriage cert: " + ((PersonMale) p).getMarriageCertificates().size() );
            }else {
                System.out.println("Birth cert: " +  ((PersonFemale) p).getBirthCertificates().size() );
                System.out.println("Marriage cert: " +  ((PersonFemale) p).getMarriageCertificates().size() );
            }*/
   //     });
    }
}