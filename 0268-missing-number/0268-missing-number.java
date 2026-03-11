class Solution {
    public int missingNumber(int[] nums){
        int c=nums.length;
        int a=c*(c+1)/2;
        int count=0;
        for(int i=0;i<nums.length;i++){
            count+=nums[i];
        }
        int b=a-count;
        return b;
    }
}