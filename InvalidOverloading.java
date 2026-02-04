class InvalidOverloading
{
public double addition(int a,int b)
{
	return a+b ;
}
public void addition(int a,double b)
{
	System.out.println(" mul " +(a*b));
}
public int addition(int a,int b,int c)
{
	return a+b+c;
}
public void addition(double  a,int b)
{
	System.out.println(" division " +(a+b));
}
}

class MainclassIn
{
public static void main(String args[])
{
InvalidOverloading obj = new InvalidOverloading();
 obj.addition(10,20);
int res =obj.addition(10,20,30);

System.out.println(res);
obj.addition(20.0,3);
obj.addition(3,2.0);
}
}