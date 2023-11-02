import java.util.*;
class Program3{
              public static void main(String[]args){
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter Array size");
	      int size=sc.nextInt();
	      int arr[]=new int[size];
	      int mul=1;
	      System.out.println("Enter Array elements ");
	      for(int i=0;i<arr.length;i++){
	            arr[i]=sc.nextInt( );
		    if(i%2==1){
		         mul=mul*arr[i];
		    }
	      }
	      System.out.println("The multiplication of odd index : "+mul);
	      }}
