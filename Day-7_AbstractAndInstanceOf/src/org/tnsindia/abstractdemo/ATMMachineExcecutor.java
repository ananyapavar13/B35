package org.tnsindia.abstractdemo;

public class ATMMachineExcecutor {
	
	public static void main(String args[]) {
		ATMMachine a=new ATMMachineChild();
		//ATMMachineChild a=new ATMMachineChild();
a.withdraw();
a.display();
	}
	

}
