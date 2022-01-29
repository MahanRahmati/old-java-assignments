import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int t = reader.nextInt();
        int[] num = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            num[i] = reader.nextInt();
        }
        reader.close();
        calculator(n, t, num);
    }

    public static void calculator(int n, int t, int[] num) {
        boolean f = false;
        for (int i = 1; i < n; i++) {
            if (i + num[i - 1] == t) {
                f = true;
            }
        }
        if (f) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}