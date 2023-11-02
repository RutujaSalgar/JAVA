import java.io.*;
class Program4{
              public static void main(String[]args)throws IOException{
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("Enter start number");
	      int start=Integer.parseInt(br.readLine());
	      
	      System.out.println("Enter end number");
	      int end=Integer.parseInt(br.readLine());
	      
	      System.out.print("Even number: ");
	      for(int i=end;i>=start;i--){
	            if(i%2==0){
		          System.out.print(i +" ");
		    }
              System.out.println();

	      System.out.print("Odd number: ");
	      for( i=start;i<=end;i++){
	          if(i%2==1){
		         System.out.print(i+" ");
		  }
	      }
	      System.out.println();
	      
	      
	      }}}
