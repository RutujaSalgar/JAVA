import java.util.*;
class Program9{
              public static void main(String[]args){
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter number");
	      int number=sc.nextInt();
	      int num=number;

	      int x=0;
	      while(num!=0){
	       int rem=num%10;
	      int prod=1;
	      while(rem!=0){
	               prod=prod*rem;
	              rem--;
	      }
	      x=x+prod;
	      num=num/10;
	      }
	      System.out.println("Addition of each number factorial is"+x);
	      }
}
