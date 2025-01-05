static long find(int[] c, int n, int sum,int j,long[][] dp) {
    if(sum<0||j==n) return 0;
    if(sum==0) return 1;
    if(dp[j][sum]!=-1) return dp[j][sum];
    long s=0;
        s+=find(c,n,sum-c[j],j,dp);
        s+=find(c,n,sum,j+1,dp);
    return dp[j][sum]=s;
}

public long count(int coins[], int N, int sum) {
    long[][] dp = new long[N+1][sum + 1];
    for(long[] t:dp) Arrays.fill(t,-1);
    return find(coins,N,sum,0,dp);
}