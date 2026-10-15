import java.util.Scanner;
public class TaskB {

    public static void print(int n, char c){
        for(int i=1;i<=n ; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static  void drawRectangle(int n, int m, char c){
        for(int i=1;i<=n ; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        drawRectangle(4, 5,'*');
        drawRectangle(4, 5,'&');
        drawRectangle(4, 5,'#');

    }
}
