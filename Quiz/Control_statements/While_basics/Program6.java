class Program6{
 public static void main(String[]args){
       int var=5;
 
     System.out.println("Inside main");
     while(var-- >3);{
             System.out.println("Inside while");
     }
 }
}
//here while is an empty statement but the condition given with it
//is true which eventually becomes false.so it does not go
//into an infinite loop
