package search_insert_position;

public class Solution {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 0));
    }

    public static int searchInsert(int[] nums, int target) {

        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        int targetIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }

            if (nums[i - 1] < target && nums[i] > target) {
                targetIndex = i;
            }
        }
        return targetIndex;
    }

}
