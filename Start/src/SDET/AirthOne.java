package SDET;

// (10+2)+2)-2)*2)/2)  //sum,sub,multi,division

public class AirthOne 
{
   public int Sum(int a, int b)
   {
	   int c;
	   c=a+b;
	   System.out.println("Value for Sum = "+c);
	   return c;
   }
   
   public int Sub(int x, int y)
   {
	   int z;
	   z=x-y;
	   System.out.println("Value for Sub = "+z);
	   return z;
   }
   
   public int multi(int p, int q)
   {
	   int r;
	   r=p*q;
	   System.out.println("Value for Multi = "+r);
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
	
	   AirthOne obj=new AirthOne();
	   int SumResult = obj.Sum(10,2);
	   int SumResult2 = obj.Sum(SumResult, 2);
	   int SubResult = obj.Sub(SumResult2, 2);
	   int multiResult = obj.multi(SubResult, 2);
	   obj.div(multiResult, 2);
	   
}
}
