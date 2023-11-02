import java.util.*;
class Program4{
            public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter array size");
	    int size=sc.nextInt();
	    char arr[]=new char[size];
	    System.out.println("Enter array elements");
	    for(int i=0;i<size;i++){

          	    arr[i]=sc.next().charAt(0);
            }
	    for(int i=0;i<arr.length;i++){
	           if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
		   System.out.println(arr[i]+" ");

		   
		   }}
	    System.out.println();
	    }}
