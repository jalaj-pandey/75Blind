class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int n = arr.length, ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int req = target-arr[i];
            ans += map.getOrDefault(req,0);
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        return ans;
    }
}