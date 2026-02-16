class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int store=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                store=nums[i];
            }
            if(nums[i]==store){
                count++;
            }
            else{
                count--;
            }
        }
        return store;

    }
}