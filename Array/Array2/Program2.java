import java.util.*;
class Program2{
             public static void main(String[]args){
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter array size");
	     int size=sc.nextInt(); 
	     int arr[]=new int[size];
	     System.out.println("Enter array elements");
	     int count=0;
	     int count1=0;
	     for(int i=0;i<size;i++){
	          arr[i]=sc.nextInt();
	          if(arr[i]%2==0){
			  count++;
		        
		  }
	          else{
		          count1++;
		  }
	     }
	     System.out.println("Number of even number in array " +count);
	     System.out.println("Number of odd number in array "+count1);
	     }}
