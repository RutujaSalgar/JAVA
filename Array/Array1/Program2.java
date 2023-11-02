import java.io.*;
class Program2{
              public static void main(String[]args)throws IOException{
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("Enter size of the array");
	      int size=Integer.parseInt(br.readLine());
	      int arr[]=new int[size];
              System.out.println("Enter array elements");
	      int mul=1;
	      for(int i=0;i<arr.length;i++){
	           arr[i]=Integer.parseInt(br.readLine());
		    if(arr[i]%2==0){
		          mul=mul*arr[i];
		    }
	      }
	      System.out.println("The multiplication of even number is = "+mul);

	      }}
