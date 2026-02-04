class MethodOverloading
{
public void addition(int a,int b)
{
	System.out.println(" sum " +(a+b));
}
public void addition(int a,double b)
{
	System.out.println(" mul " +(a*b));
}
public void addition(int a,int b,int c)
{
	System.out.println(" sum_of_3 " +(a+b+c));
}
public void addition(double  a,int b)
{
	System.out.println(" division " +(a+b));
}
}

class Mainclass
{
public static void main(String args[])
{
MethodOverloading obj = new MethodOverloading();
 obj.addition(10,20);
obj.addition(10,20,30);
obj.addition(20.0,3);
obj.addition(3,2.0);
}
}