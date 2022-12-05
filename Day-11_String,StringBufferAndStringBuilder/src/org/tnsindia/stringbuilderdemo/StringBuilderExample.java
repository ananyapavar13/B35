package org.tnsindia.stringbuilderdemo;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Ananya Pavar"); //12
		
		//capacity method returns the current capacity
				/*The capacity is the number of characteristic can be stored
				 (including already written characters),beyond which an allocation will occur*/
				System.out.println(s.capacity()); //by default capacity is 16+ will take length of input
				System.out.println(s.length());
				System.out.println(s.append("Anu"));
				System.out.println(s.insert(10, "Capgemini"));
				System.out.println(s.capacity());
				s.setCharAt(2, 'Z');
				System.out.println(s);
				


	}

}
