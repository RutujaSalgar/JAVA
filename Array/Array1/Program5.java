import java.util.*;
class Program5{
              public static void main(String[]args){
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter array size");
	      int size=sc.nextInt();
	      int arr[]=new int[size];
	      System.out.println("Enter array elements");
	      for(int i=0;i<size;i++){
	           arr[i]=sc.nextInt();
	      }
	      System.out.println("The elements are divisible by 5");
	      for(int i=0;i<size;i++){
	           if(arr[i]%5==0){
		       System.out.println(arr[i]+" ");
		   }
	      }
	      System.out.println();
	      }}
