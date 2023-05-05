-- ------------------------------ 1st Exercise ---------------------------------------  

CREATE DATABASE ONLINE_CONSULTANCY;

CREATE TABLE Doctor (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    specialization VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    phone_number VARCHAR(20)
);

CREATE TABLE Patient (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    phone_number VARCHAR(20)
);

CREATE TABLE Appointment (
    id INT PRIMARY KEY,
    doctor_id INT NOT NULL,
    patient_id INT NOT NULL,
    appointment_date DATE NOT NULL,
    appointment_time TIME NOT NULL,
    appointment_duration INT NOT NULL,
    FOREIGN KEY (doctor_id) REFERENCES Doctor(id),
    FOREIGN KEY (patient_id) REFERENCES Patient(id)
);

CREATE TABLE Review (
    id INT PRIMARY KEY,
    doctor_id INT NOT NULL,
    patient_id INT NOT NULL,
    rating INT NOT NULL,
    review_text TEXT,
    FOREIGN KEY (doctor_id) REFERENCES Doctor(id),
    FOREIGN KEY (patient_id) REFERENCES Patient(id)
);


-- ------------------------------ 2nd Exercise ---------------------------------------  

CREATE TABLE CONTACT (
    Id INT PRIMARY KEY,

	Email VARCHAR(255),

	fname VARCHAR(20),

	lname VARCHAR(20),

	company VARCHAR(50),

	Active_flag INT,

	opt_out INT
);

insert into contact values
(123,"a@a.com","Kian","Seth","ABC",1,1),
(133,"b@a.com","Neha","Seth","ABC",1,0),
(234,"c@c.com","PURU","Malik","CDF",0,0),
(342,"d@d.com","Sid","Maan","TEG",1,0);

SELECT * FROM Contact WHERE Active_flag = 1;

UPDATE Contact SET Active_flag = 0 WHERE opt_out = 1;

DELETE FROM Contact WHERE company = 'ABC';

INSERT INTO Contact VALUES (658, 'mili@gmail.com', 'mili', NULL, 'DGH', 1, 1);

SELECT DISTINCT company FROM Contact;

UPDATE Contact SET fname = 'niti' WHERE fname = 'mili';


-- ------------------------------ 23rd Exercise ---------------------------------------  




CREATE TABLE customer (
    customer_id INT PRIMARY KEY,
    cust_name VARCHAR(255),
    city VARCHAR(255),
    grade INT,
    salesman_id INT
);

INSERT INTO customer (customer_id, cust_name, city, grade, salesman_id) VALUES
    (3002, 'Nick Rimando', 'New York', 100, 5001),
    (3007, 'Brad Davis', 'New York', 200, 5001),
    (3005, 'Graham Zusi', 'California', 200, 5002),
    (3008, 'Julian Green', 'London', 300, 5002),
    (3004, 'Fabian Johnson', 'Paris', 300, 5006),
    (3009, 'Geoff Cameron', 'Berlin', 100, 5003),
    (3003, 'Jozy Altidor', 'Moscow', 200, 5007),
    (3001, 'Brad Guzan', 'London', NULL, 5005);



CREATE TABLE salesman (
    salesman_id INT PRIMARY KEY,
    salesman_name VARCHAR(50) NOT NULL,
    city VARCHAR(50) NOT NULL,
    commission DECIMAL(4,2) NOT NULL
);


INSERT INTO salesman VALUES
    (5001, 'James Hoog', 'New York', 0.15),
    (5002, 'Nail Knite', 'Paris', 0.13),
    (5005, 'Pit Alex', 'London', 0.11),
    (5006, 'Mc Lyon', 'Paris', 0.14),
    (5007, 'Paul Adam', 'Rome', 0.13),
    (5003, 'Lauson Hen', 'San Jose', 0.12);



SELECT c.cust_name, c.city AS customer_city, c.grade, s.salesman_name, s.city AS salesman_city
FROM customer c
JOIN salesman s ON c.salesman_id = s.salesman_id
WHERE c.grade < 100
ORDER BY c.customer_id ASC;




