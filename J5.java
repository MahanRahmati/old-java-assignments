import java.util.Scanner;

public class J5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        long n = reader.nextLong();
        reader.close();
        calculator(n);
    }

    public static void calculator(long number) {
        int f = 0;
        for (long i = number / 2; i < number; i++) {
            int a = S(i);
            int b = S(number - i);
            f = Math.max(f, a + b);
        }
        System.out.println(f);
    }

    public static int S(long number) {
        String string = Long.toString(number);
        char[] ch = string.toCharArray();
        int f = 0;
        for (char c : ch) {
            f = f + Character.getNumericValue(c);
        }
        return f;
    }

}