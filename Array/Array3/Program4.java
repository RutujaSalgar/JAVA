import java.io.*;
class Program4{
              public static void main(String[]args)throws IOException{
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("Enter array size");
	      int size=Integer.parseInt(br.readLine());
	      int arr[]=new int[size];
	      System.out.println("Enter array elements");
	      for(int i=0;i<size;i++){
	          arr[i]=Integer.parseInt(br.readLine());
	      }
	      System.out.println("Prime Numbers are ");
	      for(int i=0;i<size;i++){
		      if(arr[i]>=2){
		      int count=0;
	                for(int j=2;j*j<arr[i];j++){
			    if(arr[i]%j==0){
			        count++;
			    }
			if(count==0){
			 System.out.println("Prime number "+arr[i]+"found at index "+i);
			}}}
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      }}}
