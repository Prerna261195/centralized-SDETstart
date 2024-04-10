package SDET;

public class Third 
{

	public Third()
	{
		this (28, 68, 72);
		System.out.println("Default Value");
	}
	
	public Third(int a)
	{
		this (20, 45, 37, 20);
		System.out.println("One Parameterized Constructor");
	}
	
	public Third(int b, int c)
	{
		this (10);
		System.out.println("Two Parameterized Constructor");
	}
	
	public Third (int d, int e, int f)
	{
		System.out.println("Three Parameterized Constructor");
	}
	
	public Third (int g, int h, int i, int j)
	{
		this ();
		System.out.println("Four Parameterized Constructor");
	}
	
	public static void main(String[] args) 
	{
	 Third obj=  new Third(10, 11);
	}
	
}
