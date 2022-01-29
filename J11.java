import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class J11 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.close();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        List<List<Integer>> list = new ArrayList<>();
        System.out.println("{}");
        calculator(list, new ArrayList<>(), nums, 0);
    }

    static void calculator(List<List<Integer>> list, List<Integer> resultList, int[] nums, int start) {
        list.add(new ArrayList<>(resultList));
        for (int i = start; i < nums.length; i++) {
            resultList.add(nums[i]);
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            for (int num : resultList) {
                sb.append(num);
                if (resultList.size() > 1 && num != resultList.get(resultList.size() - 1).intValue()) {
                    sb.append(", ");
                }
            }
            sb.append("}");
            System.out.println(sb.toString());
            calculator(list, resultList, nums, i + 1);
            resultList.remove(resultList.size() - 1);
        }
    }

}