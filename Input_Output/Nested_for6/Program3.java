import java.io.*;
class Program3{
              public static void main(String[]args) throws IOException{
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("Enter Start range");
	      int start=Integer.parseInt(br.readLine());
	      System.out.println("Enter end range");
	      int end=Integer.parseInt(br.readLine());
	      System.out.println();
	      for(int i=start;i<=end;i++){
	               for(int j=1;j*j<=i;j++){
		          if(j*j==i){
			          System.out.println(i+" ");
			  }
		       }}
	      }}
