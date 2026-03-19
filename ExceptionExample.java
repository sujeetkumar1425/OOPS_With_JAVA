
import java.util.*;
class ExceptionExample
{
    public static void main(String[] args){
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        try{int c=a/b;
        System.out.println("Value of c is :" +  c);}
       catch (ArithmeticException e){
            System.out.println("Arithmeric exception, please give non-zero values" +e);
       }
    }
}
