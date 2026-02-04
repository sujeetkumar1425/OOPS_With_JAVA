class ispr {
public static void main(String [] args){
boolean isPrime = true;
int n = Integer.parseInt(args[0]);

if (n < 2) {
    System.out.println(n + " not_Prime");
    return;
}

for (int i = 2; i * i <= n; i++) {
    if (n % i == 0) {
        isPrime = false;
        break;
    }
}

if (isPrime) {
    System.out.println(n + " is_Prime");
}else{
System.out.println(n + " not_Prime");
}
}
}
