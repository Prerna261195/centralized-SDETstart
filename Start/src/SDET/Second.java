package SDET;

//  (10+2)(10-2) // Sum,Sub,Multi

public class Second 
{
   public int Sum(int a, int b)   // nonvoid output parameter with parameterized input parameter
   {
	   int c;
	   c=a+b;
	   System.out.println("Sum result = "+c);
	   return c;   //'return' keyword we use whenever we need the result for further use
   }
   
   public int sub(int x, int y)   // nonvoid output parameter with parameterized input parameter
   {
	   int z;
	   z=x-y;
	   System.out.println("Sub result = "+z);
	   return z;   //'return' keyword we use whenever we need the result for further use
   }
   
   public void multi(int c, int z)  //void output parameter with parameterized input parameter
   {
	   int m;
	   m=c*z;
	   System.out.println("Multi result = "+m);
   }
   
   public static void main(String[] args)   //mainmethod
   {
	   Second obj=new Second();  //calling class
	   
	  int sumResult = obj.Sum(10,2);
	  int subResult = obj.sub(10,2);
	   obj.multi(sumResult, subResult);
	   
	   
}
}
