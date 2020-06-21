package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component tells spring that this is a bean.
@Component
public class BinarySearchImpl {
	
	// @Autowired tells that sortAlgorithm is its dependency/BinarySearchImpl depends on sortAlgorithm
	@Autowired
	private SortAlgorithm sortAlgorithm; //use an interface instance as variable
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {   //generate a constructor
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[]numbers, int numberToSearchFor) {
		
		// BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		
		int [] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
	
	//Sorting an array. Implementing sorting logic
		
	//bubble sort algorithm (tight coupled to binary search, to uncouple (move out), 
	// or to loosely create a bubble or quicksort class, then use an instance in 
	// binarySearch method). But still you need switch the method; to really loosely
	// couple, you can create an algorithm interface that have the method body. Then in the
	// bubblesort and quicksortalgorithm just implement the method.
	// Then use it in this class (use an interface instance as a variable of this class)
	
	//search the array
	
	//return the result
	return 3;
	}

}
