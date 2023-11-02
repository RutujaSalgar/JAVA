import java.io.*;
class Program6{
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
		      int rev=0;
	              int temp=arr[i];
	               while(temp!=0){
		            int rem=temp%10;
		            rev=rev*10+rem;;
		            temp=temp/10;
		       }
	     if(rev==arr[i])
	                System.out.println("Palindrome number "+arr[i]+" found at index "+i);
	      }	      
	      
	      
	      
	      
	      
	      }}
