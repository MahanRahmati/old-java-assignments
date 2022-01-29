import java.util.Scanner;

public class J21 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        Double k = reader.nextDouble();
        Double s = reader.nextDouble();
        reader.close();
        if (n * k > s) {
            System.out.println("We need more!");
        } else {
            System.out.println("Enough!");
        }
    }

}
