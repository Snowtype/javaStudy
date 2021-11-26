package personalPractice;

public class BubbleSortPractice {
    public static void main(String[] args) {
        boolean numswitched = true;
        int[] nums = {10, 4, 1, 3, 5, 1, 6, 8};

        while (numswitched) {
            numswitched = false;
            for (int i = 0; i < nums.length - 1; i++) {
                if(nums[i+1]<nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    numswitched = true;
                }
            }
        }

        for (int num : nums) {
            System.out.print(num + ", ");
        }
    }
}
