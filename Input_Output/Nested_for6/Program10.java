import java.util.*;
class Program10{
              public static void main(String[]args){
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter Start range");
	      int start=sc.nextInt();
	      System.out.println("Enter End range");
	      int end=sc.nextInt();

	      System.out.println();

	      for(int i=start;i<=end;i++){
	         int num=i;
		 int count=0;
		 int sum=0;
	          while(num!=0){
		      count++;
		      num=num/10;
		  
		  }
	     num=i;
	      while(num!=0){
	             int mult=1;
	             int rem=num%10;
	              for(int j=1;j<=count;j++){
		          mult=mult*rem;
		      }
	        sum=sum+mult;
	        num=num/10;
	      }
	      if(sum==i)
	           System.out.println(i);
	      }
	      }
}
