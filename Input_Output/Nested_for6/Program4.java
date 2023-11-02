import java.io.*;
class Program4{
	      public static void main(String[]args)throws IOException{
	      BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	      System.out.println("Enter Start Range");
	      int start=Integer.parseInt(br.readLine());
	      System.out.println("Enter End Range");
	      int end =Integer.parseInt(br.readLine());
	      
	      System.out.println();
	      for(int i=start;i<=end;i++){
	             for(int j=1;j*j*j<=i;j++){
		         if(j*j*j==i)
		               System.out.print(i+" ");
		     }
	      }
	      }
}
