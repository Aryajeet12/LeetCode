class Solution {

    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        permut(nums, 0);
        return result;
    }

    void permut(int[] nums, int index) {

        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                temp.add(nums[i]);
            }
            result.add(temp);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            permut(nums, index + 1);
            swap(nums, index, i); 
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
