package com.dong79.spring.createspringboot;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	public List<Course> retriveAllcourses(){
		return Arrays.asList(
				new Course(1,"Learn AWS","Dong");
				new Course(2,"Learn Spring","Dong");
				);
	}
}
