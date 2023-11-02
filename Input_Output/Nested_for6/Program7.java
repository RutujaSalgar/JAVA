import java.io.*;
class Program7{
              public static void main(String[]args)throws IOException{
	      BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	      System.out.println("Enter Start range");
	      int start=Integer.parseInt(br.readLine());
	      System.out.println("Enter End range");
	      int end=Integer.parseInt(br.readLine());
	      
	      System.out.println();
	      
	      for(int i=start;i<=end;i++){
		      int rev=0;
		      int num=i;
		      int rem = 0;
		      while(num != 0){
			       rem=num%10;
			       rev=rev*10+rem;
			       num=num/10;
		      }
		      System.out.println(rev);
	          
	      
	      }
	      }
}
