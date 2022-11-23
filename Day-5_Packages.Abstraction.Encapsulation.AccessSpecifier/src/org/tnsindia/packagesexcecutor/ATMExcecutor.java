package org.tnsindia.packagesexcecutor;

import java.util.Scanner;

//importing the class of another package
//import org.tnsindia.packagesdemo
import org.tnsindia.packagesdemo.*;

//driver class
public class ATMExcecutor {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the card no:");
		String card_no=s.nextLine();
		ATM obj=new ATM();
		obj.display(card_no);
		s.close();
	}
	
	

}
