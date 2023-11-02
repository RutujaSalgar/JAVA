import java.io.*;
class Program8{
        public static void main(String[]args)throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter start range");
	int start=Integer.parseInt(br.readLine());
	System.out.println("Enter End range");
	int end=Integer.parseInt(br.readLine());
	
	System.out.println();
	
	for(int i=start;i<=end;i++){
	      int num=i;
	      int rev=0;
	      while(num!=0){
	      int rem=num%10;
	      rev=rev*10+rem;
	      num=num/10;
	      }
	      if(rev==i){
	           System.out.println(rev);
	      }
	}}}
