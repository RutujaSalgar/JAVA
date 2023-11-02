import java.util.*;
class Program1{
              public static void main(String[]args){
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter array size");
	      int size=sc.nextInt();
	      int arr[]=new int[size];
	      System.out.println("Enter array elements");
	      int sum=0;
	      for(int i=0;i<size;i++){
	           arr[i]=sc.nextInt();
	           sum=sum+arr[i];
		   
	      }
	      System.out.println("Sum of array elements is = "+sum);
	      }}
