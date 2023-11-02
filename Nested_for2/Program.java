class Program10{
                public static void main(String[]args){
			int rows=6;
		      for(int i=1;i<=6;i++){
			      int num=rows;
			      char ch='F';
		                for(int j=1;j<=6;j++){
				     if(j%2==0){
				          System.out.print(num+" ");

				     }
				      else{
				          System.out.print(ch+" ");
				      }
				      ch--;
				      num--;
				}
				System.out.println();

				}
		      }
		}

