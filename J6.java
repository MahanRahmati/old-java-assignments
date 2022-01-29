import java.util.Scanner;

public class J6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int h = reader.nextInt(); 
        int w = reader.nextInt(); 
        int p = reader.nextInt(); 
        reader.close();
        System.out.println(calculator(h, w, p));
    }

    public static int calculator(int h, int w, int p) {
        return h * w * p;
    }
}
