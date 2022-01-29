import java.util.Scanner;

public class J12 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.close();
        calculator(n);
    }

    public static void calculator(int number) {
        StringBuilder sb = new StringBuilder();
        sb.append("W");
        for (int k = 0; k < number; k++) {
            sb.append("o");
        }
        sb.append("w!");
        System.out.println(sb.toString());
    }

}