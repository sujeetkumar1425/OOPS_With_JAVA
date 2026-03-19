package Experiment_06;

import java.sql.SQLOutput;

public class yts {
    public static void main(String[] args) {
        A obj=(int i ,int j ) -> {
            System.out.println("Addition is" );
            return  i+j;
        };
        System.out.println(obj.method(7,8));
    }
}
@FunctionalInterface
interface A{
    int method(int i , int j );
}
