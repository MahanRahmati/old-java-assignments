import java.util.Scanner;

public class J16 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String string = reader.nextLine();
        reader.close();
        calculator(string);
    }

    public static void calculator(String string) {
        String newString = string;
        while (newString.indexOf("//") >= 0) {
            newString = newString.replace("//", "/");

        }
        if (newString == "") {
            System.out.println("/");
        } else {
            if (newString.charAt(newString.length() - 1) == '/') {
                System.out.println(newString.substring(0, newString.length() - 1));
            } else {
                System.out.println(newString);
            }
        }
    }

}