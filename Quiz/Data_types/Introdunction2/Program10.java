class Program10{
       public static void main(String[]args){
                int a=10,b=10,c=10,d=10;
       System.out.println(++a);//11
       System.out.println(b++);//10
       System.out.println(+-c);//10
       System.out.println(-++d);//10
       }
}
//System.out.println(+-c);: This line involves both the unary plus + operator and the unary minus - operator. The + operator doesn't change the sign of the value, and the - operator negates the value. Since you have both operators, the expression effectively does nothing. The value of c (10) is printed to the console.
//
//System.out.println(-++d);: Here, the unary minus - operator is applied to the result of the pre-increment ++ operator. The pre-increment operator increments the value of d by 1 before using it in the expression, and then the unary minus negates the result. Since the value of d is incremented to 11 and then negated, the result is -11, which is printed to the console
