package Experiment_03;

public class person {
    String name;
    int age;
    person(String n, int r){
        name=n;
        age=r;
    }
    public void display(){
        System.out.println("the name "+ name +" the age " + age);
    }
    public static void main(String args[]){
        person s1=new person("Surya",20);
        s1.display();
        System.out.println("Name : Sujeet Kumar" + " Roll_No : 2400320101134");


    }
}
