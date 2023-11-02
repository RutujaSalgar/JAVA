import java.util.*;
class Program7{
              public static void main(String[]args){
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter array-1 size");
              int size=sc.nextInt();
	      int arr[]=new int[size];
	      System.out.println("Enter array-1 elements");
	      for(int i=0;i<size;i++){
	             arr[i]=sc.nextInt();
	      }

	      System.out.println("Enter array-2 size");
              int size1=sc.nextInt();
	      int arr1[]=new int[size1];
	      System.out.println("Enter array-2 elements");
	      for(int i=0;i<size;i++){
		      arr1[i]=sc.nextInt();
	      }

	      System.out.println("Common elements in array-1 and array-2");
	      for(int i=0;i<size;i++){
	            for(int j=0;j<size1;j++){
		      if(arr[i]==arr1[j]){
		        System.out.println(arr[i]);
		      }
		    }}

	      
	      
	      
	      
	      }}
