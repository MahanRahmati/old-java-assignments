import java.util.Scanner;

public class J10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String string = reader.nextLine();
        reader.close();
        calculator(string, 0);
    }

    public static void calculator(String string, int l) {
        String replacement = "";
        if (l + 1 < string.length()) {
            System.out.println(string);
            for (int j = 0; j < l + 1; j++) {
                replacement = replacement + Character.toString(string.charAt(l + 1));
            }
            String newString = replacement + string.substring(l + 1);
            calculator(newString, l + 1);
        } else {
            for (int j = 0; j < string.length(); j++) {
                replacement = replacement + Character.toString(string.charAt(string.length() - 1));
            }
            System.out.println(replacement);
        }
    }
}
