class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int LMB[] = new int[n];
        LMB[0] = height[0];
        for(int i=1; i<n; i++){
            LMB[i] = Math.max(height[i], LMB[i-1]);
        }
        int RMB[] = new int[n];
        RMB[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            RMB[i] = Math.max(height[i], RMB[i+1]);
        }
        int trappedWater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(RMB[i], LMB[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }
}