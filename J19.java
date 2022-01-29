import java.util.Scanner;

public class J19 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        String[] matrix = new String[n];
        for (int i = 0; i < n; i++) {
            matrix[i] = reader.next();
        }
        reader.close();
        int count = 0;
        int k = 2;
        while (k * 2 <= n) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < k; i++) {
                builder.append("*");
            }
            for (int i = 3; i < n; i++) {
                int index = matrix[i].indexOf(builder.toString());
                while (index >= 0) {
                    int f = 0;
                    for (int j = 1; j < 2 * k; j++) {
                        if (i - j >= 0) {
                            if (matrix[i - j].charAt(index) == '*') {
                                f++;
                            }
                        }
                    }
                    if (f == (k * 2) - 1) {
                        count++;
                    }
                    index = matrix[i].indexOf(builder.toString(), index + 1);
                }
            }
            k++;
        }
        System.out.println(count);
    }
}