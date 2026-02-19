package Experiment_04;
// Cunstructor chaining;
class A {
    A(){
        System.out.println("this is class a");
    }
}
class B extends A{
    B(){
        System.out.println("this is class B");
    }
}

class MainClass{
    public static void main(String agrs[]){
        B obj=new B();
    }
}