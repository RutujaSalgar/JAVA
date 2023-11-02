import java.io.*;
class Program2{
              public static void main(String[]arsg)throws IOException{
	      BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	      System.out.println("Enter Start range");
	      int start=Integer.parseInt(br.readLine());
	      System.out.println("Enter End range");
	      int end=Integer.parseInt(br.readLine());
	      
	      System.out.println();
	      for(int i=start;i<=end;i++){
		      int count=0;
		      for(int j=1;j*j<=i;j++){
	          		 if(i%j==0)
		        		 count++;
		      }
		   if(count>=2)
		            System.out.println(i);
		   
		      }
	      }}
