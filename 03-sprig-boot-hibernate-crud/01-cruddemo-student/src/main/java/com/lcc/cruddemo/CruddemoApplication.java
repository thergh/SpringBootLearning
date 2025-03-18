package com.lcc.cruddemo;

import com.lcc.cruddemo.dao.StudentDAO;
import com.lcc.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}


//	from spring boot, executed after beans loaded
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);
//			createMultipleStudents(studentDAO);
//			readStudent(studentDAO);
			queryForStudents(studentDAO);
		};
	}

	private void queryForStudents(StudentDAO studentDAO){
		List<Student> theStudents = studentDAO.findAll();

		for(Student s : theStudents){
			System.out.println(s);
		}
	}

	private void readStudent(StudentDAO studentDAO){
		System.out.println("Creating a student object");
		Student tempStudent = new Student("Duffy", "Duck", "daffy@mail");
		studentDAO.save(tempStudent);
		int theId = tempStudent.getId();
		System.out.println("Saved student. ID = " + theId);
		System.out.println("Retrieving student with ID = " + theId);
		Student myStudent = studentDAO.findById(theId);
		System.out.println("Found student: " + myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO){
		System.out.println("Creating multiple student objects");
		Student tempStudent1 = new Student("name1", "surname1", "email1");
		Student tempStudent2 = new Student("name2", "surname2", "email2");
		Student tempStudent3 = new Student("name3", "surname3", "email3");
		studentDAO.save(tempStudent1);
		System.out.println("Saved. Generated id: " + tempStudent1.getId());
		studentDAO.save(tempStudent2);
		System.out.println("Saved. Generated id: " + tempStudent2.getId());
		studentDAO.save(tempStudent3);
		System.out.println("Saved. Generated id: " + tempStudent3.getId());
	}

	private void createStudent(StudentDAO studentDAO){
		System.out.println("Creating student object");
		Student tempStudent = new Student("Lukasz", "Ciswicki", "lukasz.ciswicki@gmail.com");
		System.out.println("Saving student");
		studentDAO.save(tempStudent);
		System.out.println("Saved. Generated id: " + tempStudent.getId());
	}

}



















