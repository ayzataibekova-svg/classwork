import java.util.Scanner;
public class TaskL{


    public static boolean isPrime(int n) {
        int a = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                a++;
            }
        }
        if (a == 2) return true;
        return false;

    }
    public static void main(String[] args) {
        for (int i = 10; i <= 20; i++) {
        if (isPrime(i))
        System.out.println(i+"");
        }
    }
}
