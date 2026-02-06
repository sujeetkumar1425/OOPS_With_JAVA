class student
{
String name;
String deptname;
int roll_no;
String college;

student (){
deptname="CSE";
college="ABES";
}
student(String name ,int roll_no){
this();
this.name=name;
this.roll_no=roll_no;
}

public void display()
{
System.out.println(" student details are " + name + " " + roll_no  + " " + deptname + " " + college);
}
}

class Mainclass_this
{
public static void main(String [] args){
student stu =new student();
stu.display();
student stu1 =new student("ABES",101);
stu1.display();
}
}