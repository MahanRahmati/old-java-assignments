import java.util.Scanner;

public class J4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = reader.nextInt();
        }
        reader.close();
        for (int i = 0; i < n; i++) {
            calculator(nums[i]);
        }
    }

    public static void calculator(int number) {
        int f = 0;
        if (number > 10) {
            String string = Integer.toString(number);
            int n = string.length();
            f = f + (9 * (n - 1));
            int maxN = (number / (int) (Math.pow(10, (n - 1))));
            for (int i = 1; i < (maxN + 2); i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(Integer.toString(i));
                for (int k = 1; k < n; k++) {
                    sb.append(Integer.toString(i));
                }
                if (number >= Long.parseLong(sb.toString())) {
                    f++;
                }
            }
        } else {
            for (int i = number; i > 0; i--) {
                if (check(Integer.toString(i)) == true) {
                    f++;
                }
            }
        }
        System.out.println(f);
    }

    public static boolean check(String string) {
        char[] ch = string.toCharArray();
        for (char c : ch) {
            if (c != ch[0]) {
                return false;
            }
        }
        return true;
    }

}