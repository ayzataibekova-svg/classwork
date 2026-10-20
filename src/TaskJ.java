import java.util.Scanner;
public class TaskJ {
    public static int divisors(int n) {
        int a = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                a++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int k=divisors(12);
        System.out.println(k);
        System.out.println(divisors(1000));
    }
}
