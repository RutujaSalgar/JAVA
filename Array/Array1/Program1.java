import java.io.*;
class Program1{
	/*
          public static void main(String[]args)throws IOException{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Enter array size");
	  int arr_size=Integer.parseInt(br.readLine());
	   
	  int arr[]=new int[arr_size];
	  System.out.println("Enter array elements");
	   int sum=0;
	  for(int i=0;i<arr_size;i++){
		  
	     int array_elements=Integer.parseInt(br.readLine());
		     if(array_elements%2==1){
		        sum=sum+array_elements;
		     }
	  }
	     System.out.println("sum is "+sum);
	  }*/
           public static void main(String[]args)throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   
	   System.out.println("Enter size of the array");
	   int size=Integer.parseInt(br.readLine());
	   int arr[]=new int[size];
	   int sum=0;
	   System.out.println("Enter Array elements");
	   
	   for(int i=0;i<size;i++){
	       arr[i]=Integer.parseInt(br.readLine());
	    if(arr[i]%2==1){
	        sum=sum+arr[i];
	    }
	   }
	   System.out.println("sum of odd number in array = "+sum);
	   }



}
