import java.util.function.Predicate;

class Even implements Predicate<Integer> {
    @Override
    public boolean test(Integer num) {
        return num % 2 == 0;
    }
}

public class IsEven{
    public static void main(String[] args) {
        Predicate<Integer> p = new Even();
        System.out.println(p.test(4));
        System.out.println(p.test(5));
    }
}