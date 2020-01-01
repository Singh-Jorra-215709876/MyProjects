package binarySearch;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class binarySearchTesterRec {

	@Test
	void binarySearch01() {
		Random rand = new Random();
		List<Integer> myList = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			myList.add(rand.nextInt(10));
		}
		Collections.sort(myList);
		
		int x = rand.nextInt(10);
		boolean exp = myList.contains(x);
		boolean got = binarySearchRec.binarySearchAlgorithm(x, myList);
//		System.out.println(myList);
//		System.out.println(x);
//		System.out.println(exp);
//		System.out.println(got);
		assertEquals(exp,got);
		
	}
	@Test
	void binarySearch02() {
		Random rand = new Random();
		List<Integer> myList = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			myList.add(rand.nextInt(10));
		}
		Collections.sort(myList);
		
		int x = rand.nextInt(10);
		boolean exp = myList.contains(x);
		boolean got = binarySearchRec.binarySearchAlgorithm(x, myList);
//		System.out.println(myList);
//		System.out.println(x);
//		System.out.println(exp);
//		System.out.println(got);
		assertEquals(exp,got);
		
	}

}
