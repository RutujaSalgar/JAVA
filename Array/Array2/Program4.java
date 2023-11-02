import java.util.*;
class Program4{
              public static void main(String[]args){
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter array size");
	      int size=sc.nextInt();
	      int arr[]=new int[size];
	      System.out.println("Enter array elements");
	      for(int i=0;i<size;i++){
		      arr[i]=sc.nextInt();
	      }
	     
	      System.out.println("Enter array elements to search");
	      int search=sc.nextInt();
	      System.out.println("You have enter element to search "+search);
	      for(int i=0;i<size;i++){
	            if(arr[i]==search){
		          System.out.println("Index of "+search+" is "+i);
		    }
		    }
		    }
}
