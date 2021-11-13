package com.muthu.basic.sb.k8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class MyBasicController {

	@GetMapping("/greeting")
	public String greeting() {
		String hostName = System.getenv("HOSTNAME");
		return "Muthu : Welcome Spring Boot in Docker and Kubernate and hostname is "+hostName+" !!";
	}
}
