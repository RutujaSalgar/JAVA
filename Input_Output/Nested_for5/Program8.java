import java.util.*;
class Program8{
              public static void main(String[]args){
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter number of rows");
	      int row=sc.nextInt();
	      
	      for(int i=1;i<=row;i++){
	             for(int j=1;j<=i;j++){
		          if(i%4==1){
			       System.out.print("$"+" ");
			  }
			  else if(i%4==2){
			       System.out.print("@"+" ");
			  }
			  else if(i%4==3){
			       System.out.print("&"+" ");
			  }
			  else
		     		System.out.print("#"+" ");
		     }
	      System.out.println();
	      }
	      
	      }}
