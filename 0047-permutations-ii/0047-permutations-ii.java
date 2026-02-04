class Solution {
     List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums){
        Arrays.sort(nums);
        perm(nums,0);
        return result;
    }
    void perm(int[] nums,int index){
        if(index==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                temp.add(nums[i]);
            }
            result.add(temp);
            return;
        }
        HashSet<Integer> used = new HashSet<>(); 
        for(int i=index;i<nums.length;i++){
            if (used.contains(nums[i])) continue;
            used.add(nums[i]);
            swap(nums,index,i);
            perm(nums,index+1);
            swap(nums,index,i);
        }
    }
    void swap(int[] nums, int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}