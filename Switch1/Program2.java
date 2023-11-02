import java.util.*;
class Program2{
            public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
	   
	 
	   System.out.println("Enter number");
	   int num=sc.nextInt();
	   if(num<0)
	         num=6;
	   
	   if(num>5)
	        num=7;
	   

	   switch(num){

		    case 0 :
			    System.out.println("Zero");
			    break;

	            case 1:
	                     System.out.println("One");
	                     break;
	            case 2:
	                     System.out.println("Two");
	                     break;
	            case 3: 
	                     System.out.println("Three");
	                     break;
	            case 4:
			     System.out.println("Four");
			     break;
		    case 5:
			     System.out.println("Five");
			     break;
	            case 6:
			     System.out.println("Number is negative");
			     break;
	     
	            case 7 :
			     System.out.println("Number is greater than five");
			     break;

	   
	   
	   }
	   }
	   
	    }
