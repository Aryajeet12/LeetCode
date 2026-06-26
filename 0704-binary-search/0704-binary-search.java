class Solution {

    int binaryserch(int[] arr, int target,int start,int end){
        if(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>=arr[mid]){
                return binaryserch(arr,target,mid+1,end);
            }
            else{
                return binaryserch(arr,target,start,mid-1);
            }
        }
        return -1;
    }
    public int search(int[] arr, int target) {
        return binaryserch(arr,target,0,arr.length-1);
    }
}