import java.util.*;
class Program1{
            public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter array size");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    System.out.println("Enter array elements");
	    for(int i=0;i<size;i++){
	      arr[i]=sc.nextInt();
	    }
	 
	    for(int i=0;i<size;i++){
		    int count=0;
	         int temp=arr[i];
	         while(temp!=0){
	
		    count++;
		    temp=temp/10;
		    
		    }
	
	    System.out.println(count);
	    }
	    
	    
	    
	    
	    
	    
	    
	    }}
