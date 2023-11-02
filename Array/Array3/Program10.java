import java.util.*;
class Program10{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		if(size>2){
			for(int i=0;i<size;i++){
				for(int j=i+1;j<size;j++){
					if(arr[i]>arr[j]){
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		else{
			System.out.println("You have entered size of " + size);
		}
		System.out.println("Second largest number"+arr[1]);
	}
}

