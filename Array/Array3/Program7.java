import java.io.*;
class Program7{
              public static void main(String[]args)throws IOException{
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("Enter array size");
	      int size=Integer.parseInt(br.readLine());
	      int arr[]=new int[size];
	      System.out.println("Enter array elements");
	      for(int i=0;i<size;i++){
	           arr[i]=Integer.parseInt(br.readLine());
	      }
	       for(int i=0;i<size;i++){
	                 int temp=arr[i];
	                 int sum=0;
	          while(temp!=0){
		        int rem=temp%10;
		         int fact=1;
		            for(int j=1;j<=rem;j++)
		               fact=fact*j;
		     
		    sum=sum+fact;
		  temp=temp/10;
		  }
	       if(sum==arr[i])
	           
	       System.out.println("Strong number "+arr[i]+" found at index "+i);
	       }
	      
	      
	      
	      }}
