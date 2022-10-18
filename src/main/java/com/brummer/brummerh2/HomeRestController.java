package com.brummer.brummerh2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brummer.brummerh2.test.Test;
import com.brummer.brummerh2.test.TestRepository;

@RestController
@RequestMapping("/homeRestController")
public class HomeRestController {

	private final TestRepository testRepository;
	
	public HomeRestController(TestRepository testRepository) {
		this.testRepository = testRepository;
	}
	
	@GetMapping("/listAllTests")
	public Iterable<Test> listTests(){
		return testRepository.findAll();
	}
	
	@GetMapping("/deleteAllTests")
	public void deleteAll() {
		testRepository.deleteAll();
	}
	
}
