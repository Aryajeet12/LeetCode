class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length / 2;
        int count = 0;
        int[] diff = new int[costs.length];

        for (int i = 0; i < costs.length; i++) {
            int[] a = costs[i];
            count += a[0];                  
            diff[i] = a[1] - a[0];          
        }
        Arrays.sort(diff);
        for (int i = 0; i < n; i++) {
            count += diff[i];
        }

        return count;
    }
}
//not me 