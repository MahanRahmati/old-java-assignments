import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        reader.nextLine();
        String string = reader.nextLine();
        reader.close();
        String[] names = string.split("\\s+");
        calculator(names);
    }

    public static void calculator(String[] names) {
        for (int i = 1; i < names.length; i++) {
            for (int j = i - 1; j > -1; j--) {
                System.out.print(names[i]);
                System.out.print(": Hello ");
                System.out.print(names[j]);
                System.out.println("!");
            }
        }
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
            System.out.println(": Bye!");
            for (int j = i + 1; j < names.length; j++) {
                System.out.print(names[j]);
                System.out.print(": Bye ");
                System.out.print(names[i]);
                System.out.println("!");
            }
        }
    }
}
