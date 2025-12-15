class Solution {
    public long getDescentPeriods(int[] prices) {
        long count = 1;
        long a=1;
        for(int i=1;i<prices.length;i++){
            if(prices[i]==prices[i-1]-1){
                a++;
            }
            else{
                a=1;
            }
            count+=a;
        }
        return count;
    }
}