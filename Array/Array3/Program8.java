import java.util.*;
class Program8{
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
	         int sum=0;
		 int temp=arr[i];
		 while(temp!=0){
		  count++;
		 temp=temp/10;
		 }
		 temp=arr[i];
		 while(temp!=0){
		    int mult=1;
		    int rem=temp%10;
	       for(int j=1;j<=count;j++){
	             mult=mult*rem;
	       }
	       sum=sum+mult;
	       temp=temp/10;
		 }
		 if(sum==arr[i])
			  System.out.println("Armstromg number "+arr[i]+"found at index "+i);

	    
	       }}}
