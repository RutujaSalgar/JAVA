import java.util.*;
class Program10{
               public static void main(String[]args){
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter Start number:");
	       int start=sc.nextInt();
	       System.out.println("Enter End Number:");
	       int end=sc.nextInt();
	       
	       System.out.println("Prime Series Numbers Are:");
	       
	       for(int i=start;i<=end;i++){
	             int count=0;
	            for(int j=1;j*j<i;j++){
		        if(i%j==0){
			   count=count+2;
			}
			if(count>2)
		            break;
		    }
	       if(count<=2 && i!=1)
	           System.out.print(i+" ");
	       }
	       System.out.println();
	       }
}
