package SDET;

//(10*2)+2)-2)*2)/2)

public class AirthTwo 
{
	public int Multi(int a, int b)
	   {
		   int c;
		   c=a*b;
		   System.out.println("Value for Multi = "+c);
		   return c;
	   }
	   
	   public int Sub(int x, int y)
	   {
		   int z;
		   z=x-y;
		   System.out.println("Value for Sub = "+z);
		   return z;
	   }
	   
	   public int sum(int p, int q)
	   {
		   int r;
		   r=p+q;
		   System.out.println("Value for Sum = "+r);
		   return r;
	   }
	   
	   public void div(int m, int n)
	   {
		   int o;
		   o=m/n;
		   System.out.println("Value for Div = "+o);
	   }
	   
	   public static void main(String[] args) 
	   {
		
		   AirthTwo obj=new AirthTwo();
		   int MultiResult = obj.Multi(10,2);
		   int sumResult = obj.sum(MultiResult, 2);
		   int SubResult = obj.Sub(sumResult, 2);
		   int multiResult2 = obj.Multi(SubResult, 2);
		   obj.div(multiResult2, 2);
		   
	}
	
	
}
