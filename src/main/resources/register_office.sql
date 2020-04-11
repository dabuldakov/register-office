drop table if exists ro_birth_certificate;
drop table if exists ro_marriage_certificate;
drop table if exists ro_passport;
drop table if exists ro_person;

create table ro_person(
    person_id SERIAL,
    sex smallint not null,
    first_name varchar(100) not null,
    last_name varchar(100) not null,
    patronymic varchar(100),
    date_birth date not null,
    primary key (person_id)
    );

create table ro_passport(
    passport_id SERIAL,
    person_id integer not null,
    seria varchar(10) not null,
    number varchar(10) not null,
    issue_date date not null,
    issue_dep varchar not null,
    PRIMARY KEY (passport_id),
    FOREIGN KEY (person_id) REFERENCES ro_person(person_id) on delete restrict
);

create table ro_birth_certificate(
    birth_certificate_id SERIAL,
    birthday_number varchar(20) not null ,
    issue_date date not null ,
    person_id integer not null ,
    father_id integer,
    mother_id integer,
    PRIMARY KEY (birth_certificate_id),
    FOREIGN KEY (person_id) REFERENCES ro_person(person_id) on delete restrict,
    FOREIGN KEY (father_id) REFERENCES ro_person(person_id) on delete restrict,
    FOREIGN KEY (mother_id) REFERENCES ro_person(person_id) on delete restrict
);

create table ro_marriage_certificate(
    marriage_certificate_id SERIAL,
    marriage_number varchar(20) not null ,
    issue_date date not null ,
    husband_id integer not null ,
    wife_id integer not null ,
    active boolean DEFAULT false,
    end_date date,
    PRIMARY KEY (marriage_certificate_id),
    FOREIGN KEY (husband_id) REFERENCES ro_person(person_id) on delete restrict,
    FOREIGN KEY (wife_id) REFERENCES ro_person(person_id) on delete restrict
);

insert into ro_person(sex,first_name, last_name, patronymic, date_birth)
values
(1, 'Elena', 'Vasileva', 'Sergeevna', '1998-03-24'),
(2, 'Oleg', 'Vasilev', 'Petrovich', '1995-01-22'),
(2, 'Nikolay', 'Vasilev', 'Olegovich', '2005-03-07');

insert into ro_passport(person_id, seria, number, issue_date, issue_dep)
VALUES
       (1, '4000', '334433', '2018-03-22', 'Department passport');

insert into ro_birth_certificate(birthday_number, issue_date, person_id, father_id, mother_id)
VALUES
('445525', '2005-03-07', 3, 2, 1);

insert into ro_marriage_certificate(marriage_number, issue_date, husband_id, wife_id, active, end_date)
VALUES('qwe123', '2020-04-6', 2, 1, true, '2020-05-22')