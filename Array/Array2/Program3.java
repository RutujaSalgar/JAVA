import java.util.*;
class Program3{
              public static void main(String[]args){
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter array size");
	      int size=sc.nextInt();
	      int arr[]=new int[size];
	      int sum=0;
	      int sum1=0;
	      System.out.println("Enter array elements");
	      for(int i=0;i<size;i++){
	           arr[i]=sc.nextInt();
	           if(arr[i]%2==0){
		         sum=sum+arr[i];
		   }
	           else{
		        sum1=sum1+arr[i];
		   }
	      }
	      System.out.println("Sum of even number in array "+sum);
	      System.out.println("Sum of odd number in array "+sum1);
	      }
	      }

