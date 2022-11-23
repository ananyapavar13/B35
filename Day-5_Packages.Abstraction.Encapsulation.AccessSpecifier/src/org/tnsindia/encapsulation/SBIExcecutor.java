package org.tnsindia.encapsulation;

import org.tnsindia.accessspecifier.PublicDemo;

public class SBIExcecutor {

	public static void main(String[] args) {
		SBI h=new SBI();
		
		//setters method is used to set a value
		h.setAmount(50000);
		
		//getters method is used to return a value
		System.out.println(h.getAmount());
		
		PublicDemo p=new PublicDemo();
		p.print(455.55);
		
	}

}
