package org.tnsindia.inheritancedemo;

import java.util.Scanner;

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//vehicle name-parent
		System.out.println("Enter the Vehicle name:");
        String veh_name=s.nextLine();
        Tyre t=new Tyre();
        t.setName(veh_name);
        t.display();
        //brand-Parent2 and child1
        System.out.println("Enter the Vehicle brand name:");
        String brand=s.nextLine();
        t.setName1(brand);
        t.display();
        //tyre-child class2
        System.out.println("Enter the Vehicle brand name:");
        String t_name=s.nextLine();
        t.setTyre_name(t_name);
        t.display3();
        s.close();
	}
}

