import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.

        Arrays.sort(nums);

        int max = 0;
        for(int i = 0; i<nums.length / 2; i++) {
            int add = nums[i] + nums[2*n-i-1];

            if(max < add) {
                max = add;
            }
        }

        System.out.print(max);
    }
}