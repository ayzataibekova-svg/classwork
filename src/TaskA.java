import java.util.Scanner;
public class TaskA {

    public static void print(int n,char c){
        for(int i=1;i<=n ; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args){
        print(80,'#');
        print(10,'+');
        print(7,'*');
    }
}
