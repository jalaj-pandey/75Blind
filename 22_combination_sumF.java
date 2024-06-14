class Solution {
    public int combinationSum4(int[] nums, int target) {
        int sumCount [] = new int[target+1];
        sumCount[0] = 1;
        int size = nums.length;
        for(int i=1; i<=target; i++){
            for(int j=0; j<size; j++){
                if(nums[j] <= i){
                    sumCount[i] = (sumCount[i] + sumCount[i-nums[j]]);
                }
            }
        }
        return sumCount[target];
    }
}