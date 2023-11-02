import java.io.*;
class Program6{
              public static void main(String[]args)throws IOException{
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     System.out.println("Enter two character");
	     char ch1=(char)br.read();
	     br.skip(1);
	     char ch2=(char)br.read();

	     if(ch1==ch2)
		     System.out.println("Two characters are same");
	     else{
	     	     int diff=ch1-ch2;
		       if(diff<0){
		            diff=diff*(-1);
		       }
		       System.out.println("the difference between "+ch1+"and"+ch2+"character is "+diff);

	     }
	     
	     
	     
	     
	     
	     
	     
	      }}
