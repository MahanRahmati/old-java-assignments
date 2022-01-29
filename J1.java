import java.util.Scanner;

public class J1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String string = reader.nextLine();
        reader.close();
        calculator(string);
    }

    public static void calculator(String string) {
        int i;
        for (i = 4; i > 0; i--) {
            System.out.print(string.charAt(i));
        }
        System.out.println(string.charAt(0));
    }
}
