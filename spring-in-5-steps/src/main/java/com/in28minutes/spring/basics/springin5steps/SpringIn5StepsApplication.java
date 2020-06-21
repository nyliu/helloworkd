package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//this annotation enables springboot automatically scan the package where springin5stepsapplication is.
//this answers the 3rd question
@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
		//3 questions to tell spring: 1) what are the beans?-->use @Component
		// 2)what are dependencies of a bean?  -->use @Autowired
		// (e.g. sortAlgorithm is a dependency of binarysearchimpl)
		// 3) where to search for beans?  done by springboot. -->@SpringBootApplication
		
		
		// apply bubblesortalgorithm   java related?
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		// com.in28minutes.spring.basics.springin5steps.BubbleSortAlgorithm@3764951d
		
		//apply quicksortalgorithm   java related?
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		//int result = binarySearch.binarySearch(new int [] {12, 4, 6}, 3);
		//System.out.println(result);
		//-->com.in28minutes.spring.basics.springin5steps.QuickSortAlgorithm@3764951d
		
		//In spring framework, beans are created/managed in an Application Context
		ApplicationContext applicationContext=SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class); 
		int result = binarySearch.binarySearch(new int [] {12, 4, 6}, 3);
		System.out.println(result);
	}

}
