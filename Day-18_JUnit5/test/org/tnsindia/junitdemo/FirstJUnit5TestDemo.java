package org.tnsindia.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FirstJUnit5TestDemo {
	/*it signifies that this is a test method in to which
	 * we write our code
	 */

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	//Disabled annotation makes the method as a disabled
	@Disabled
	void display()
	{
		fail("Fail to print");
		
	}
}
