import java.util.*;
class Program3{
              public static void main(String[]args){
	      Scanner sc=new Scanner(System.in);
	      int num1;
	      int num2;
	      System.out.println("Enter First number");
	      num1=sc.nextInt();

	      System.out.println("Enter Second number");
	      num2=sc.nextInt();

	      if(num1<0||num2<0){
	              System.out.println("Negative number is not allowed");
	      }
	      else{
	                  switch((num1*num2)%2){
			  
			           case 0 :
			                     System.out.println("The multiplication is even");
			                     break;

			           case 1 :
			                     System.out.println("the multiplication is odd");
			                     break;
			  }}
	      }}
