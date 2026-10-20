import java.util.Scanner;
public class TaskF {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        for (int i = a; i <=b; i++) {
            System.out.println("Giving a star to Student " + i);
        }
    }
}
