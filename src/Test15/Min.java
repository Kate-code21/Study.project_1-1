package Test15;

public class Min {
    public static void main(String[] args) {
        int[] nums = new int[] {34,22,56,11,74};
        int min = nums[0];

        for (int i = 0; i < nums.length;i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(min);
    }
}
