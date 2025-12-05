class Solution {
    public int countPartitions(int[] nums){
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int a=0;
        int b=0;
        int diff;
        for(int i=0;i<nums.length-1;i++){
            a+=nums[i];
            b=sum-a;
            diff=a-b;
            if(diff%2==0){
                count+=1;
            }
        }
        return count;
    }
}