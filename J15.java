import java.util.Scanner;

public class J15 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int l = reader.nextInt();
        reader.close();
        calculator(a, b, l);
    }

    public static void calculator(int a, int b, int l) {
        if ((l % 2) == 0) {
            System.out.println((l / 2 * a) + (l / 2 * b));
        } else {
            System.out.println((((l + 1) / 2) * a) + (((l + -1) / 2) * b));
        }
    }

}