public class Solution {
    public int maxSubArray(int[] nums) {
       long cs = 0;
       long ms = Integer.MIN_VALUE;
       for(int i=0; i< nums.length; i++){
        cs += nums[i];
        ms = Math.max(cs, ms);
        if(cs<0){
            cs = 0;
        }
       }
       return (int)ms;
    }
}
