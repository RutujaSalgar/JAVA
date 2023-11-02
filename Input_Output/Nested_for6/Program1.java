import java.io.*;
class Program1{
              public static void main(String[]args)throws IOException{
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("Enter lower limit");
	      int start=Integer.parseInt(br.readLine());
	      System.out.println("Enter Upper limit");
	      int end=Integer.parseInt(br.readLine());
               
	      int count=0;
	      System.out.println();
	      for(int i=start;i<=end;i++){
	              if(i%5==0 && i%2==0){
		         count++;
		      System.out.println(i+" ");
		      }
	      }
	      System.out.println("Count = "+count);


	      }}
