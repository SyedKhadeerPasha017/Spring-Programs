package com.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.entity.Student;
import com.web.repo.StudentRepo;

@SpringBootApplication
public class Application implements CommandLineRunner
{
	@Autowired
	private StudentRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Student s1=new Student(103,"Syed","Python",3242);
		//Student s2=new Student(104,"Prince","Java",6543);
		//repo.save(s1);
		//repo.save(s2);
		//System.out.println("New Student Record Inserted.....");
		
		//System.out.println("----GET ONE STUDENT RECORD---");
		//Student getone=repo.findById(101).get();
		//System.out.println(getone);
		
		//System.out.println("----GET ALL STUDENT RECORDS---");
		//List<Student>listofStudents=(List<Student>) repo.findAll();
		//System.out.println(listofStudents);

		//System.out.println("----DELETE ONE STUDENT RECORD---");
		//repo.deleteById(101);
		//System.out.println("One Record Deleted...");
		
		System.out.println("----UPDATE STUDENT RECORD---");
		Student oldRecord=repo.findById(102).get();
		Student newData=new Student();
		newData.setStdName("Tiger");
		newData.setCourse("AWS");
		newData.setFee(1231.43);
		oldRecord.setStdName(newData.getStdName());
		oldRecord.setCourse(newData.getCourse());
		oldRecord.setFee(newData.getFee());
		repo.save(oldRecord);
		System.out.println("Record updated Successfully...");

		

	}

}
