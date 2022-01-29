import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int i;
        int[] A = new int[10];
        int mul, div, sum, sub;
        try {
            n = input.nextInt();
            try {
                for (i = 0; i < n; i++) {
                    if (i < 10) {
                        try {
                            A[i] = input.nextInt();
                        } catch (Exception e) {
                            input.close();
                            System.out.println("What are you doing?");
                            System.exit(0);
                        }
                    } else {
                        input.close();
                        throw new ArithmeticException(">10");
                    }
                }
                mul = A[0] * A[1];
                System.out.println(mul);

                try {
                    div = A[0] / A[1];
                    System.out.println(div);
                } catch (Exception e) {
                    System.out.println("Second number is 0");
                }

                sum = A[0];
                for (i = 1; i < n; i++)
                    sum += A[i];
                System.out.println(sum);

                sub = A[0];
                for (i = 1; i < n; i++)
                    sub -= A[i];
                System.out.println(sub);
            } catch (Exception e) {
                input.close();
                System.out.println(">10");
                System.exit(0);
            }
        } catch (Exception e) {
            input.close();
            System.out.println("What are you doing?");
            System.exit(0);
        }
        input.close();
    }
}