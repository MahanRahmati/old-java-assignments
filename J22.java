import java.util.Scanner;

public class J22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int p = reader.nextInt();
        int d = reader.nextInt();
        reader.close();
        for (int i = 1; i < 1000; i++) {
            int number = d * i;
            if (number % p <= (p / 2)) {
                System.out.println(number);
                System.exit(0);
            }
        }
    }
}
