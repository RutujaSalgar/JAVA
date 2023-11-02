import java.io.*;
class Program6{
              public static void main(String[]args)throws IOException{
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("how manu number you want to take from user");
	      int num=Integer.parseInt(br.readLine());
	      int count=0;

	      do{
	           System.out.println("Enter Number");
	           int num1=Integer.parseInt(br.readLine());
	          
	           int temp=num1;
	           int count1=0;
	            
	      while(temp!=0){
	             count1++;
	             temp=temp/10;
	      }
	      System.out.println("Number "+num1+" "+"has the count "+count1+ " ");
	      count++;
	      }
	      while(count!=num);
	      }
}
