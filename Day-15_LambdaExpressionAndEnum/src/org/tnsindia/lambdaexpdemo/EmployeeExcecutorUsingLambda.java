package org.tnsindia.lambdaexpdemo;
//driver class
public class EmployeeExcecutorUsingLambda {

	public static void main(String[] args) {
	/*implementing the functinal interface-Employee using
	  Lambda Expression-with no parameter*/
		/*Employee obj=()->{
		  System.out.println("Lambda expression-No parameter");
		  };
		  obj.display();*/
		
		/*implementing the functional interface-Employee using
		  Lambda Expression-with no parameter*/
		/*Employee obj=(int a,int b)->{
		  
		  int result=(a>b)?a:b;
		    System.out.println("The maximum number is: "+result);
		    return result;
		    };
		    obj.max(42,68);*/
		
		
		  //lambda expression without return type
		   Employee obj=(a,b)->(a>b)?a:b;
		   System.out.println("The maximum number is: "+obj.max(42,68));
		  
	}

}
