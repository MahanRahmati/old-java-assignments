import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = reader.nextInt();
        }
        reader.close();
        quickSort(numbers, 0, n - 1);
        printArray(numbers, n);

    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr, int size) {
        if (size % 2 == 0) {
            for (int i = 0; i < size / 2; i++) {
                System.out.print(arr[size - 1 - i] + " ");
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = 0; i < (size - 1) / 2; i++) {
                System.out.print(arr[size - 1 - i] + " ");
                System.out.print(arr[i] + " ");
            }
            System.out.print(arr[(size / 2)] + " ");
        }
        System.out.println();
    }
}
