package org.tnsindia.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void test() {
		System.setProperty("Ananya", "Anu");
		
		//Excecute the body when the positive condition else test will be skipped
		Assumptions.assumeTrue("Anu".equals(System.getProperty("Ananya")));
	}
	@Test
	void display() {
		System.setProperty("Ananya", "Anu");
		//Excecute the body when the negative condition else test will be skipped
		Assumptions.assumeFalse("Pavar".equals(System.getProperty("Ananya")));
	}

	@Test
	void print() {
		System.setProperty("Ananya", "Anu");
		
		Assumptions.assumingThat(true, null);
	}
}
