package org.tnsindia.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestDemo {
	
	@RepeatedTest(3)
	void test() {
		System.out.println("Welome");
		
	}

}
