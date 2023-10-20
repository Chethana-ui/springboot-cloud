package com.example.springbootcloud;

import com.example.springbootcloud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SpringbootCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;


	public void run(String... args) throws Exception {

}}
