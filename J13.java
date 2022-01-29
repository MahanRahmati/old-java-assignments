import java.util.Scanner;
import java.util.Arrays;

public class J13 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int s = reader.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = reader.nextInt();
        }
        reader.close();
        calculator(numbers, n, s);
    }

    public static void calculator(int[] numbers, int n, int s) {
        Arrays.sort(numbers);
        int price = 0;
        for (int i = 0; i < s; i++) {
            price = price + numbers[numbers.length - i - 1];
        }
        System.out.println(price);
    }

}