package letcode;

public class RemoveDuplicates {
    public int[] removeDuplicates(int[] nums) {
        if (nums.length == 0) return null;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        int[] rest = new int[i+1];
        for(int gul = 0; gul <= i; gul++){
            rest[gul] = nums[gul];
        }
        return rest;
    }
}
