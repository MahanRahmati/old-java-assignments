import java.util.Scanner;

public class J20 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        StringBuilder builder = new StringBuilder(reader.nextLine());
        reader.close();
        while (builder.toString().charAt(0) == '=') {
            builder.deleteCharAt(0);
        }
        while (builder.toString().indexOf('=') != -1) {
            int index = builder.toString().indexOf('=');
            if (index != -1) {
                if (index == 0) {
                    builder.deleteCharAt(0);
                } else {
                    builder.delete(index - 1, index + 1);
                }
            }
        }
        System.out.println(builder.toString());
    }
}