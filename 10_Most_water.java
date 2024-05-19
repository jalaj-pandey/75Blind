class Solution{
    public int maxArea(int[] height){
        int max = 0, lp = 0, rp = height.length-1;
        while(lp < rp){
            int lh = height[lp];
            int rh = height[rp];
            int temp = Math.min(lh,rh)*(rp-lp);
            if(temp>max){
                max = temp;
                if(lh<rh){
                    lp++;
                }
                else
                    rp--;
            }
        }
        return max;
    }
}