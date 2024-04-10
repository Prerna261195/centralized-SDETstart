package SDET;

public class First // class
{

	int Prerna;  //variable
	public void pandey ()  //method
	{
	  System.out.println("Lets start SDET");   //method body
	}
	
	public static void main(String[] args)   //main method
	{
		First abc=new First(); //creating object
		abc.Prerna=2611;  //calling variable
		System.out.println("Value of Prerna = "+abc.Prerna);
		abc.pandey(); //calling method
	}
	
}
