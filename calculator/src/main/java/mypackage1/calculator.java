package mypackage1;
import Package2.*;
import java.util.*;
public class calculator 
{
    //public static void main( String[] args )
	public calculator()
    {
    	System.out.println("Enter two numbers");
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	System.out.println("Choose appropriate options 1)ADD 2)DIVIDE 3)SUBTRACT 4)MULTIPLY");
    	int k=sc.nextInt();
    	switch(k) {
    	case 1:System.out.println("The sum of "+a+" and "+b+" is :");
    			System.out.println(a+b);
    			break;
    	case 2:System.out.println("The quotient of "+a+" and "+b+" is :");
    		    System.out.println(a/b);
    		    break;
    	case 3:System.out.println("The difference of "+a+" and "+b+" is :");
    			System.out.println(a-b);
    			break;
    	case 4:System.out.println("The product of "+a+" and "+b+" is :");
    			System.out.println(a*b);
    			break;
    	default:System.out.println("enter valid entries for a,b and k");
    	
    	}
    	
    }
}