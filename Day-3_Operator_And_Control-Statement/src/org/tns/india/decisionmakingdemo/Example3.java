package org.tns.india.decisionmakingdemo;

public class Example3 {
	public static void main(String[] args) {
		int age=21,weight=50;
		if(age>=23)
		{
			if(weight>=45)
			{
				if (weight<=100)
				{
					System.out.println("Eligible for bunje jumping");
				}
				else
				{
					System.out.println("Extra rope will be added");
		        }
			}
				else
				{
					System.out.println("Not Eligible for bunje jumping");
		        }
		}
		else
		{
			System.out.println("Not Eligible for bunje jumping");
        }

}
}

