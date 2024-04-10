package SDET;

public class Student 
{
   int Roll_No;
   int Age;
   
   public void abc()
   {
	   System.out.println("Welcome to all of you");
   }
   
   public void xyz()
   {
	   System.out.println("Automation is very easy");
   }
   
   public static void main(String[] args) 
   {
	Student magic=new Student();
	magic.Roll_No=26;
	System.out.println("Roll No of the Student = " +magic.Roll_No);
	magic.Age=10;
	System.out.println("Age of the Student = " +magic.Age);
	magic.abc();
	magic.xyz();
}
   
}
