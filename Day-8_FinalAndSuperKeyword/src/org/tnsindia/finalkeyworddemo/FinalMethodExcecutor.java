package org.tnsindia.finalkeyworddemo;

public class FinalMethodExcecutor {

	public static void main(String[]args) {
		FinalMethodWithChild f=new FinalMethodWithChild ();
	 f.aadhar_no=65565555655454L;
	 f.PAN_no="ANU34567";
	 //f.print();
	 f.print(f.PAN_no);
	}
}
