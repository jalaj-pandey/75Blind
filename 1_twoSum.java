import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ret[] = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    ret[0] = i;
                    ret[1] = j;
                }
            }
        }
        return ret;
    }
}


// HashMap implementation

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
       Map <Integer, Integer> map = new HashMap<>();

       for(int i=0; i<nums.length; i++){
        int diff = target - nums[i];
        if(map.containsKey(diff)){
            return new int[] {map.get(diff),i};
        }
        map.put(nums[i],i); //if value doesn't exist add it to the hashmap
       }
       return null;
    }
}