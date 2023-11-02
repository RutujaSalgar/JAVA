import java.util.*;
class Program9{
      public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Start range");
      int start=sc.nextInt();
      System.out.println("Enter end range");
      int end=sc.nextInt();

      System.out.println();

      for(int i=start;i<=end;i++){
          int num=i;
          int sum=0;
           while(num!=0){
	        int rem=num%10;
	        int fact=1;
	           for(int j=1;j<=rem;j++)
	                  fact=fact*j;
	           sum=sum+fact;
	           num=num/10;
	   }
      if(sum==i)
               System.out.println(i);
      }
      
      }}
