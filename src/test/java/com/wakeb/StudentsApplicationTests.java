package com.wakeb;

import com.wakeb.controller.StudentController;
import com.wakeb.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class StudentApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	StudentController studentController;

	@Autowired
	StudentService studentService;

	@Test
	void testFindAll() {
		RestTemplate restTemplate = new RestTemplate();

		String url = "http://localhost:9090/students";
		List students = restTemplate.getForObject(url, List.class);

		int size = students.size();
		assertTrue(size > 0, "Error in students array size");
	}
}