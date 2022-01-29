import java.util.Scanner;

public class J8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int m = reader.nextInt();
        int n = reader.nextInt();
        reader.close();
        calculator(m, n);
    }

    public static void calculator(int m, int n) {
        if (m > n) {
            for (int i = n; i < m + 1; i++) {
                print(i);
            }
        } else if (n > m) {
            for (int i = m; i < n + 1; i++) {
                print(i);
            }
        } else {
            System.out.println("equal");
        }
    }

    public static void print(int a) {
        System.out.println(a);
    }
}
