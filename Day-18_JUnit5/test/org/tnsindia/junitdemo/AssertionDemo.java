package org.tnsindia.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertionDemo {

	@Test
	void accept() {
		
		/*if both the value is not same then it will fail*/
		assertEquals(17,17);
	}

	@Test
	void print() {
		
		/*if the atual value is not null then it fails*/
		assertNull(null);
		
	}
	@Test
	void dispaly() {
		//fails if expression is not true
		assertTrue(3!=4);
		
	}
}
