import java.util.Scanner;

public class J7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        reader.close();
        calculator(a, b);
    }

    public static void calculator(int a, int b) {
        if (a > b) {
            System.out.println(b);
            System.out.println(a);
        } else {
            System.out.println(a);
            System.out.println(b);
        }
    }
}
