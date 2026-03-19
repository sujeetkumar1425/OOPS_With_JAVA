package Experiment_06;

import java.util.*;

class LambdaExpression {
    public static void main(String args[]){
        Runnable r=()->{for(int i=0;i<=20;i+=2){
            System.out.println("value is "+ i);}
        };
        Thread t=new Thread(r);
        t.start();

    }
}
