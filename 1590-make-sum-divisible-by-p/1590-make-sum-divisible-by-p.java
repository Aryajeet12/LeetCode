/* *************************************** */
class Solution {
    public int minSubarray(int[] nums, int p) {

        long total = 0;
        for (int x : nums) total += x;

        long target = total % p;
        if (target == 0) return 0; // Already divisible

        long prefix = 0;
        int n = nums.length;
        int res = n;

        java.util.HashMap<Long, Integer> map = new java.util.HashMap<>();
        map.put(0L, -1);  // base prefix

        for (int i = 0; i < n; i++) {
            prefix = (prefix + nums[i]) % p;

            long need = (prefix - target + p) % p;

            if (map.containsKey(need)) {
                res = Math.min(res, i - map.get(need));
            }

            map.put(prefix, i);
        }

        return res == n ? -1 : res;
    }
}
/* ************************* */