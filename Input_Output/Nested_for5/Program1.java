import java.io.*;
class Program1{
               public static void main(String[]args) throws IOException{
		       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		       System.out.println("Enter number of rows");
		       int row=Integer.parseInt(br.readLine());

	                int num=row;
			int ch=row+64;
	       for(int i=1;i<=row;i++){
	            for(int j=1;j<=row;j++){
                            if(i%2==1){
			    System.out.print((char)ch-- +""+num-- +" ");
 				}
			    else{
			    System.out.print((char)ch++ +""+num++ +" ");
				}
		    }
		      if(i%2==1){
		           
			    num++;
			    ch++;
		      }
		      else{
		      
			   num--;
			   ch--;
		      }
		    
	       System.out.println();
	       }
	       }
}
