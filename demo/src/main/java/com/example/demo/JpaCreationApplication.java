package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaCreationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaCreationApplication.class, args);

	}
/*	@Bean
	CommandLineRunner commandLineRunner(StudentRepo studentRepo,SubjectRepo subjectRepo,TeacherRepo teacherRepo){
		return args -> {
			Student s1=new Student("Abdelaziz");
			studentRepo.save(s1);
			Teacher teacher=new Teacher("Samir");
			teacherRepo.save(teacher);
			Subject subject=new Subject("Math");
			subjectRepo.save(subject);

		};*/
	//}


}
