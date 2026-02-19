package Experiment_03;

public class privateClass {
    private String name;
    private int age;
    private String country;
    privateClass(String name,int age, String country){
        this.name=name;
        this.age=age;
        this.country=country;

    }

    public String getname(){
        return name;
    }
    public String getCountry(){
        return country;
        }
    public int getAge(){
        return age;}
    public void setname(String name){
        this.name=name;
        }
    public void setage(int age){
        this.age=age;
    }

    public void setcountry (String country){
        this.country=country;
    }
    public void display(){
        System.out.println("name is " + name );
        System.out.println("age is " + age);
        System.out.println("country is  " + country );

    }

    public static void main(String args[]){
        privateClass s=new privateClass("sujeet",20,"jp");
//        Experiment_03.privateClass s1=new Experiment_03.privateClass();
        s.setname("surya");
        s.setage(29);
        s.setcountry("India");
        s.display();
        System.out.println("Name : Sujeet Kumar" + " Roll_No : 2400320101134");
   }
}
