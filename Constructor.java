class employee
{
String empName;
int salary;
String deptName;
 public void display()
{ System.out.println(" employee Name " + empName + " salary " + salary + " DeptName " + deptName);
}
public void insertDetails(String e, int s, String d){
empName=e;
salary=s;
deptName=d;}

employee(int a)
{ empName="Rohit";
salary=a;
deptName="computerscience";
}
}

class Mainclass 
{
public static void main (String [] args){
employee emp = new employee(300);
emp.display();
emp.empName="ABC";
emp.salary=1000;
emp.deptName="XYZ";
emp.display();
emp.insertDetails("anil",2000,"CSE");
emp.display();
}
}
