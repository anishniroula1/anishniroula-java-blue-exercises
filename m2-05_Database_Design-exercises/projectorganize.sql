CREATE TABLE department
(
        department_id serial primary key,
        name varchar(100) NOT NULL
        
        
);

CREATE TABLE project 
(
        project_id serial primary key,
        department_id int NOT NULL,
        project_name varchar(100),
        start_date timestamp, 
        
        
        constraint fk_project_department_id foreign key (department_id) references department(department_id) 
);

CREATE TABLE employee 
(
        employee_id serial primary key,
        job_title varchar(255) NOT NULL,
        last_name varchar(100) NOT NULL,
        first_name varchar(100) NOT NULL,
        gender varchar(50) NOT NULL,
        date_of_birth timestamp,
        date_of_hire timestamp,
        project_id int NOT NULL,
        department_id int NOT NULL,
        constraint chk_gender CHECK (gender IN ('Male', 'Female','Other')),
        
        constraint fk_employee_department_id foreign key (department_id) references department(department_id),
        constraint fk_employee_project_id foreign key (project_id) references project(project_id)     
);






INSERT INTO department(department_id, name) VALUES(1,'Finance');
INSERT INTO department(department_id, name) VALUES(2,'Developer');
INSERT INTO department(department_id, name) VALUES(3,'IT');

--Project
INSERT INTO project(project_id, department_id, project_name,start_date) VALUES(1, 2, 'Vending Machine', '2019-02-11');
INSERT INTO project(project_id, department_id, project_name,start_date) VALUES(2, 1, 'Business','2019-01-15');
INSERT INTO project(project_id, department_id, project_name,start_date) VALUES(3, 3, 'Architect','2018-04-02');
INSERT INTO project(project_id, department_id, project_name,start_date) VALUES(4, 2, 'Microwave','2019-02-12');

--Employee
INSERT INTO employee (employee_id,job_title, last_name, first_name, gender, date_of_birth, date_of_hire, project_id, department_id) 
VALUES (1,'Account Executive', 'Buffet','Fify', 'Female', '1991-11-18', '2018-10-02',1, 2 );
INSERT INTO employee (employee_id,job_title, last_name, first_name, gender, date_of_birth, date_of_hire, project_id, department_id)  VALUES (2,'Branch Manager', 'Gate', 'Bill', 'Male', '1991-05-01','2016-10-04',2, 1);
INSERT INTO employee (employee_id,job_title, last_name, first_name, gender, date_of_birth, date_of_hire, project_id, department_id)  VALUES (3,'Account Executive','Bezos', 'Jeff', 'Male','1991-06-09','2005-09-05',3, 3);
INSERT INTO employee (employee_id,job_title, last_name, first_name, gender, date_of_birth, date_of_hire, project_id, department_id)  VALUES (4,'Office Manager', 'Zuckerberg', 'Mark', 'Male','1991-04-02','2019-01-07',4, 2);
INSERT INTO employee (employee_id,job_title, last_name, first_name, gender, date_of_birth, date_of_hire, project_id, department_id)  VALUES (5,'Administrative Manager', 'Adhikari', 'Hari', 'Female','1997-04-19','2012-04-23',1, 2);
INSERT INTO employee (employee_id,job_title, last_name, first_name, gender, date_of_birth, date_of_hire, project_id, department_id)  VALUES (6,'Branch Manager', 'Niroula','Anish','Male','1991-12-03','2016-12-20',2, 1);
INSERT INTO employee (employee_id,job_title, last_name, first_name, gender, date_of_birth, date_of_hire, project_id, department_id)  VALUES (7,'Office Manager', 'Thapa','Ganga','Other','1990-12-18','2016-12-20',3,3);
INSERT INTO employee (employee_id,job_title, last_name, first_name, gender, date_of_birth, date_of_hire, project_id, department_id)  VALUES (8,'Administrative Manager','Rai', 'Rita','Female','1991-02-20','2013-09-17',4,2);


