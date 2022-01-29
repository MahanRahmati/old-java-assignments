import java.util.Scanner;

public class J18 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.close();
        calculator(n);
    }

    public static void calculator(int n) {
        int x = (n - 1) / 2;
        int y = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < y; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < x; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < x; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < y; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < x; j++) {
                System.out.print(" ");
            }
            System.out.println();
            if (i < (n - 1) / 2) {
                x = x - 1;
                y = y + 2;
            } else {
                x = x + 1;
                y = y - 2;
            }

        }
    }

}