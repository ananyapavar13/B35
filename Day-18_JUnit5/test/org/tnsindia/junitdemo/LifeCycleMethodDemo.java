package org.tnsindia.junitdemo;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

interface LifeCycleMethodDemo {

	//to use all the method with interface make the method as default
	
	@Test
	default void test() {
		System.out.println("Simple Test Method");
		
	}

	@Test
	@AfterEach
	default void print()
	{
		System.out.println("AfterEach Demo Method");
		
	}
	@Test
	@AfterAll
	default void accept()
	{
		System.out.println("AfterAll Demo Method");
		
	}
}
