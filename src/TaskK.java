import java.util.Scanner;
public class TaskK{


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
                System.out.println(isPrime(12));
                System.out.println(isPrime(11));
        }
    }
