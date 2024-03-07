import java.util.Scanner;

public class job2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String nim = input.next();
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        if (n < 10) {
            n += 10;
        }
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 != 0) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println( "nilai n" + n);
    }
}