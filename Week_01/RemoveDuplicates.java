class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int tmp = nums[0];
        int realIdx = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != tmp) {
                tmp = nums[i];
                nums[realIdx++] = nums[i];
            }
        }

        return realIdx;
    }
}
