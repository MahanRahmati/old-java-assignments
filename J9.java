import java.util.Scanner;

public class J9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int k = reader.nextInt();
        reader.close();
        System.out.println(calculator(k));
    }

    public static int calculator(int k) {
        if (k - 1 > 0) {
            return k + calculator(k - 1);
        } else {
            return k;
        }
    }
}
