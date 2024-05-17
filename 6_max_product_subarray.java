class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int res = max;
        if(n==0) 
            return 0;
        for(int i=1; i<n; i++){
            int cur = nums[i];
            int temp = Math.max(cur, Math.max(max*cur, min*cur));
            min = Math.min(cur, Math.min(max*cur, min*cur));
            max = temp;
            res = Math.max(res,max);
        }
        return res;
    }
}