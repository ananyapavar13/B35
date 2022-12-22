package org.tnsindia.client;

import org.tnsindia.application.MMBankfactory;
import org.tnsindia.application.MMCurrentAcc;
import org.tnsindia.application.MMSavingsAcc;

class Client {
	
	public static void main(String args[]) {
	
		
			MMBankfactory b =new 	MMBankfactory ();
			MMSavingsAcc s= new MMSavingsAcc(98563212,"Ananya", 50000, true);
			MMCurrentAcc c = new MMCurrentAcc(56987417,"Jisha", 40000,10000);
			
			System.out.println("Saving Account");
			s.withdraw(s.getAccBal());
			
			System.out.println();
			
			System.out.println("Current Account");
			c.withdraw(c.getAccBal());
			
			System.out.println();
			
		    System.out.println(s);
		    System.out.println(c);
		    
		   
	}

}
