package org.tns.india.decisionmakingdemo;

import java.util.Scanner;
public class Example4 {

	public static void main(String[] args) {
		//switch
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
				switch(a)
				{
				case 'x':
				System.out.println("Hi");
				break;
				case 'y':
				System.out.println("Anu");
				break;
				case 'z':
					System.out.println("Here");
				break;
				default:
					System.out.println("Invalid Input");
					s.close();
				}
	}
}

