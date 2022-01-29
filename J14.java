import java.util.Scanner;

public class J14 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String character = reader.nextLine();
        String string = reader.nextLine();
        reader.close();
        String[] words = string.split("\\s+");
        calculator(words, character);
    }

    public static void calculator(String[] words, String character) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {

            String first = words[i].toLowerCase().substring(0, 1);
            if (first.contains(character.toLowerCase())) {
                count++;
            }
        }
        System.out.println(count);
    }

}