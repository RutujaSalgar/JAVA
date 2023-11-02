import java.util.*;
class Program7{
               public static void main(String[]args){
	        Scanner sc=new Scanner(System.in);
	         System.out.println("Enter no. of rows");
		 int row=sc.nextInt();
	         int num=(row*(row+1))/2;
	        for(int i=1;i<=row;i++){
		      for(int j=1;j<=i;j++){
		           if((i%2==1 && row%2==1) ||( i%2==0 && row%2==0)){
			         System.out.print((char)(64+num)+" ");
			   }
			   else{
			           System.out.print(num+" ");
			   }
		      num--;
		      }
		System.out.println();
		}
	       }
}
