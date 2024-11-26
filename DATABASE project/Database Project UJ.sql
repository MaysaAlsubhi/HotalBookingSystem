create database  db_ProjectUJ;

use db_ProjectUJ;

create table Clinic (Clinic_id int(7) primary key, Clinic_name varchar(25) not null, Clinic_numberCall int(10) not null,Loction varchar(45) not null);

insert into Clinic values( 1773811 , 'roses truth' , 21336666 , 'Faisaliah Road');

insert into Clinic values( 18847661 , 'Life Clinic' , 920006048 , 'Al Bawadi Road');

insert into Clinic values( 18847565 , 'Pert Clinic' ,920007378, 'Slamah Road');

insert into Clinic values( 15547660 , 'Rimas Clinic' , 0590054862 , 'Madinah Road');

insert into Clinic values(  1233811 , 'Mareez Clinic' , 0509554553 , 'Safa Road');

insert into Clinic values(  1233444 , 'Rimas Clinic' , 0590054862 , 'Madinah Road');

insert into Clinic values(  1233787 , 'Almadar clinic' , 0554001238, 'Faisaliah Road');

insert into Clinic values(  1833000 , 'Rowad Clinic' , 0551309200 , 'Al Rawdh Road');

insert into Clinic values(  1832200 , 'Opal Clinic' , 0551309566 , 'Al Rawdah Road');


create table Staff (ID_Worker int(7) primary key,First_name varchar(45) not null,Last_name varchar(45) not null,S_Position varchar(35) not null,sal decimal(19,5) not null,Email varchar(55) not null,WorkTime time not null ,nationality varchar(45) not null ,gender char  not null ,Clinic_id int(7) not null ,FOREIGN KEY (Clinic_id) REFERENCES Clinic (Clinic_id));

insert into staff values( 199873 , 'maysa','alsubhi','Docter', 7500.5,'maisa@gmail.com','05:05:55', 'saudi', 'f', 1773811 );

insert into staff values( 190508 , 'shahinaz' , 'Albishi' , 'Docter' , 8000.5 , 'sha11@outlook.com','08:06:00' , 'saudi' , 'f' , 18847661);

insert into staff values( 198222 , 'Lamis' , 'Alsharef' , 'Docter' , 8500 , 'lamo@gmail.com', '16:00:00 ' , 'saudi' , 'f' , 18847565 );
 
 insert into staff values( 198888 , 'Ibrahim' , 'Al-Qurashi' , 'Docter' , 7500, 'Ibra@gmail.com', '09:15:00' , 'saudi' , 'm' , 15547660 );

insert into staff values( 198111 , 'Lama' , 'Al-Mutairi' , 'Docter' , 8000 , 'lama@gmail.com','08:10:00' , 'saudi' , 'f' , 1233811);

insert into staff values( 190777 , 'Turki' , 'Al-Qurashi' , 'Clean Worker' , 700 , 'turki22@gmail.com', '11:30:00' , 'saudi' , 'm' , 1233444);

insert into staff values( 199000 , 'ali' , 'Alsubhi','Docter', 8500 , 'ali@gmail.com', '08:11:00' , 'saudi' , 'm' , 1233787 );

insert into staff values( 194473 , 'jana','Alsubhi','nurse', 7500,'jana267a@gmail.com','05:30:55', 'saudi', 'f', 1833000 );

insert into staff values( 190473 , 'shereen','Albishi','Docter', 7500,'shereen67a@gmail.com','09:30:55', 'saudi', 'f', 1832200 );


create table Staff_Phone ( Phone_no int(10)  primary key ,ID_worker int(6),FOREIGN KEY (ID_worker) REFERENCES Staff (ID_worker) );

insert into Staff_Phone values(0534567800,199873);

insert into Staff_Phone values(0543100855,190508);

insert into Staff_Phone values(0543277651,198222);

insert into Staff_Phone values(0558887123,198888);

insert into Staff_Phone values(0544781555,198111 );

insert into Staff_Phone values (0552899888, 190777);

insert into Staff_Phone values(0550091467,199000);

insert into Staff_Phone values(0562668856,194473 );

insert into Staff_Phone values(0562660056,190473);

create table Patient (ID_Patient int(6) primary key,First_name varchar(25) not null,Last_name varchar(25) not null,age int(3) NOT NULL,Email varchar(45) not null,nationality varchar(35) not null,gender char  not null);

insert into Patient values( 123121, 'maya','alsubhi', 12, 'maya12@gmail.com','saudi', 'f');

insert into Patient values( 156987, 'Lamis' , 'alshahrani' , 11,'lamis2@gmail.com', 'saudi' ,'f');

insert into Patient values( 178900 , 'ahmed' , 'alsubhi' , 15  , 'ahmed23@outlook.com' , 'saudi' , 'm' );

insert into Patient values(158911 , 'salman' , 'Alomri' , 17 ,'salmann@gmail.com' , 'saudi' , 'm' );

insert into Patient values(152211 , 'sara' , 'alshahrani' , 18 ,'sara21@gmail.com' , 'saudi' , 'f' );

insert into Patient values(150011 , 'maram' , 'Alomri' , 10 ,'maram@gmail.com' , 'saudi' , 'f');

insert into Patient values( 123122, 'maha','alsubhi', 12 , 'maha2@gmail.com','saudi', 'f');

insert into Patient values( 120021, 'lene','albishi', 13, 'lene2@gmail.com','saudi', 'f');

insert into Patient values( 123321, 'lama','alomri', 17, 'lama2@gmail.com','saudi', 'f');

create table Patient_Phone ( Phone_no int(10)primary key,ID_Patient int(6),FOREIGN KEY (ID_Patient) REFERENCES Patient (ID_Patient) );

insert into Patient_Phone values(0534567890,123121);

insert into Patient_Phone values(0534567811,156987);

insert into Patient_Phone values(0534217890,178900);

insert into Patient_Phone values(0534567777,158911);

insert into Patient_Phone values(0541167899,152211);

insert into Patient_Phone values(0534561160,150011 );

insert into Patient_Phone values(0555289777,123122);

insert into Patient_Phone values(0534126690,120021);

insert into Patient_Phone values(0533719290,123321);

create table Treatment(Treatment_Code int(9) primary key,Quantity int(1) not null,price decimal(19,5) not null);

insert into Treatment values(111122223, 2 , 410.25);

insert into Treatment values(11177352 , 1 , 200.25);

insert into Treatment values(11199353 , 3 , 500.25 );

insert into Treatment values(11222350 , 1 , 150.99);

insert into Treatment values(13322359 , 4 , 300.99);

insert into Treatment values(111002223, 2 , 410.25);

insert into Treatment values(11100353 , 3 , 500.25 );

insert into Treatment values(13322300 , 4 , 300.99);

create table Appintment (ID_AP int(8) primary key,Treatment_code int(9) not null,Total_cost decimal(19,5) not null,data_ap date not null,time_ap time not null,reason varchar(100) not null,D_Patient int(6) not null,FOREIGN KEY (D_Patient) REFERENCES Patient (ID_Patient) ,FOREIGN KEY (Treatment_code) REFERENCES Treatment (Treatment_code) );

insert into Appintment  values(11112222 , 111122223 , 1200.75 ,'14-11-04','14:30:23', 'Periodically check', 123121);

insert into Appintment values(11117735 , 11177352 , 300.75 , '15-11-20' , '08:10:00' ,'Accumulated lime' , 156987 );

insert into Appintment values(11117700 , 11199353 , 1500.75 , '10-11-20' , ' 16:00:00' , 'malocclusions' , 178900 );

insert into Appintment values(11118855 , 11222350 ,650.99 , '01-11-20' , '09:30:00', 'Periodically check', 158911);

insert into Appintment values(11118800 , 13322359 , 701.98 , '02-11-20' , '10:30:00' , 'holes in teeth' , 152211 );

insert into Appintment values(11000222 , 111002223 , 560.5,'13-11-04','14:10:23', 'Periodically check', 150011);

insert into Appintment values(11117220 , 11100353 , 1500.75 , '10-10-20' , ' 17:00:00' , 'malocclusions' , 123121 );

insert into Appintment values(11118333 ,13322300 , 701.98 ,'23-11-20' , '10:30:00' , 'discolored teeth' , 120021 );

insert into Appintment values(11117333 , 11100353  , 1500.75 , '11-11-20' , ' 16:00:00' , 'malocclusions' , 123321 );

create table Service(Service_id int(8) primary key,name_Service varchar(55) not null,Service_cost decimal(19,5) not null);

insert into Service values(11119281, 'transsectional rays', 150.25);

insert into Service values(1118712 , 'Cleaning teeth' , 100.50);

insert into Service values(11134443 , 'Orthodontic' , 900.25 );

insert into Service values(11132233 , 'Dental Scout' , 500.00);

insert into Service values(11132200 , 'Dental filling' , 400.99);

insert into Service values(10019281, 'transsectional rays', 150.25);

insert into Service values(11134003 , 'Orthodontic' , 900.25 );

insert into Service values(11132211 , 'Dental filling' , 400.99);

insert into Service values(11100443 , 'Orthodontic' , 900.25 );

create table Service_AP(ID_AP int(8),Service_id int(8),FOREIGN KEY (ID_AP) REFERENCES Appintment (ID_AP) ,FOREIGN KEY (Service_id) REFERENCES Service (Service_id) , PRIMARY KEY (Service_id, ID_AP));

insert into Service_AP values (11112222  , 11119281);

insert into Service_AP values ( 11117735  ,1118712);

insert into Service_AP values (  11117700 ,11134443);

insert into Service_AP values ( 11118855  ,11132233);

insert into Service_AP values (11118800  ,11132200);

insert into Service_AP values ( 11000222  ,10019281);

insert into Service_AP values ( 11117220  ,11134003);

insert into Service_AP values ( 11118333  ,11132211);

insert into Service_AP values ( 11117333  ,11100443);

create table staff_ap (ID_Worker int(7), ID_AP int(8),FOREIGN KEY (ID_AP) REFERENCES Appintment (ID_AP) ,FOREIGN KEY (ID_Worker) REFERENCES Staff (ID_Worker) , PRIMARY KEY (ID_Worker, ID_AP));

insert into staff_ap values ( 190777 , 11118333 );

insert into staff_ap values (199000 , 11112222  );

insert into staff_ap values (198111 , 11117220  );

insert into staff_ap values (199873 , 11117333 );

insert into staff_ap values (190473 , 11000222 );

insert into staff_ap values (194473 , 11118800 );

insert into staff_ap values (198888 , 11117735 );

insert into staff_ap values (198222 , 11118855 );

insert into staff_ap values (190508 , 11117700 );


DESC CLINIC;

DESC STAFF;

DESC STAFF_PHONE;

DESC Patient;

DESC Patient_Phone ;

DESC Treatment;

DESC Appintment;

DESC Service;

DESC Service_AP;

DESC Staff_ap;

SELECT* FROM CLINIC;

SELECT* FROM STAFF;

SELECT* FROM STAFF_PHONE;

SELECT* FROM Patient;

SELECT* FROM Patient_Phone ;

SELECT* FROM Treatment;

SELECT* FROM Appintment;

SELECT* FROM Service;

SELECT* FROM Service_AP;

SELECT* FROM Staff_ap;


ALTER TABLE staff RENAME COLUMN sal to salary;

INSERT INTO staff (ID_Worker, First_name, Last_name,S_Position,salary,Email,WorkTime ,nationality,gender,Clinic_id) 
VALUES (1911542, 'Alaa','Fallatah','nurse', 5000.5,'Alaafallatah@gmail.com','05:06:45','saudi','f',1773811);

DELETE FROM staff WHERE first_name = 'Alaa';

DELETE FROM service WHERE service_id = '11119281';

 UPDATE staff SET s_position = 'nurse' WHERE first_name = 'ali';
 
 UPDATE staff SET sal = 8000 WHERE S_Position ='Docter';

 SELECT patient.id_patient, patient.first_name 
 FROM patient 
 WHERE  patient.gender ='f';
 
SELECT Treatment.Treatment_Code, Treatment.price
FROM Treatment
WHERE  Treatment.quantity ='4';

SELECT MIN(salary) AS minnimumSalary
FROM staff;

SELECT SUM(total_cost)
FROM Appintment;

SELECT COUNT(salary)
FROM staff;

SELECT first_name,Last_name,s_position,salary from staff where salary = (select avg(salary) from staff);

select first_name,Last_name,s_position,salary from staff where salary = (Select MAX(salary) from staff);

SELECT clinic_id, clinic_name 
FROM clinic WHERE 
Loction  = (Select Loction
FROM clinic
WHERE Loction  ='Al rawdh Road');

SELECT p.First_name,p.Last_name, pp.Phone_no
FROM patient p, patient_phone pp
WHERE p.ID_Patient = pp.ID_Patient AND p.age > (SELECT AVG(age) FROM patient WHERE gender =  'f');

SELECT total_cost, reason,quantity
FROM service INNER JOIN Treatment 
ON service.treatment_code = treatment.treatment_code 

SELECT s.First_name, s.Last_name
FROM staff s INNER JOIN patient p
ON s.gender = p.gender AND s.nationality = p.nationality;





 






