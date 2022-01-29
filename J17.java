import java.util.Scanner;

public class J17 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.nextLine();
        String string = reader.nextLine();
        reader.close();
        calculator(n, string);
    }

    public static void calculator(int n, String string) {
        String newString = string;
        int count = 0;
        while (newString.indexOf("RR") >= 0) {
            if (newString.indexOf("RR") >= 0) {
                newString = newString.replaceFirst("RR", "R");
                count++;
            }

        }
        while (newString.indexOf("GG") >= 0) {
            if (newString.indexOf("GG") >= 0) {
                newString = newString.replaceFirst("GG", "G");
                count++;
            }
        }
        while (newString.indexOf("BB") >= 0) {
            if (newString.indexOf("BB") >= 0) {
                newString = newString.replaceFirst("BB", "B");
                count++;
            }

        }
        System.out.println(count);
    }

}