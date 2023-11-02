import java.io.*;
class Program1{
              public static void main(String[]args) throws IOException{
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      int Marathimarks;
	      System.out.println("Enter Marathi marks");
	      Marathimarks=Integer.parseInt(br.readLine());
		 
              int Hindimarks;
	      System.out.println("Enter Hindi marks");
	      Hindimarks=Integer.parseInt(br.readLine());

	      int Englishmarks;
	      System.out.println("Enter English marks");
	      Englishmarks=Integer.parseInt(br.readLine());

	      int Mathmarks;
	      System.out.println("Enter Math marks");
	      Mathmarks=Integer.parseInt(br.readLine());

	      int Sciencemarks;
	      System.out.println("Enter Science marks");
	      Sciencemarks=Integer.parseInt(br.readLine());

	      if(Marathimarks<35||Hindimarks<35||Englishmarks<35||Mathmarks<35||Sciencemarks<35){
	              System.out.println("You fail in exam");
	      }
	      else{
	         double avg=(Marathimarks+Hindimarks+Englishmarks+Mathmarks+Sciencemarks)/5;
	      

	      char ch;
	      if(avg>=35){
	             ch='E';
	      }
	      else if(avg>40){
	             ch ='D';
	      }
	      else if(avg>50){
	             ch ='C';
	      }
	      else if(avg>60){
	             ch ='B';
	      }
	      else if(avg>75){
	             ch='A';
	      }
	      else{
	           ch='F';
	      }

	      switch(ch){
	       case 'A' :
		          System.out.println("First class with distinction");
			  break;
	       case 'B' :
			  System.out.println("First class");
			  break;
	       case 'C' :
			  System.out.println("Second class");
			  break;
	      case 'D'  :
			  System.out.println("Third class");
			  break;
	      case 'E' :
			  System.out.println("Pass");
			  break;
	      case 'F' :
			  System.out.println("Fail");
			  break;
	      }
	      }
}
}
