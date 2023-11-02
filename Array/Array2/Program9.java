import java.util.*;
class Program9{
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
	      for(int i=0;i<size1;i++){
		      arr1[i]=sc.nextInt();
	      }


	      int arr2[]=new int[size+size1];
	      for(int i=0;i<size;i++){
	                arr2[i]=arr[i];
	      }
	      for(int i=0;i<size1;i++){
	         arr2[size+i]=arr1[i];
	      }
	      System.out.println("Merge array" );
	      for(int i=0;i<arr2.length;i++){
	           System.out.println(arr2[i]);
	      }
	      }}
