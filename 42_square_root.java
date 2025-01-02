class Solution {
    int floorSqrt(int n) {
        // Your code here
        int ans = 0;
        for(int i=0; i<n; i++){
            if(i*i <= n) ans = i;
            else break;
        }
        return ans;
    }
}
