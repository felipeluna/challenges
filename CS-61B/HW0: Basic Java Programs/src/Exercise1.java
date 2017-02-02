import java.util.Scanner;

/**
 * Created by felipe on 2/1/17.
 */

public class Exercise1 {
    public static void drawTriangle(int N){
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        drawTriangle(N);
        System.out.println(3);
    }
}
