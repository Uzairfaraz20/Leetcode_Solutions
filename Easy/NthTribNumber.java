class Solution {
    public int tribonacci(int n) {
        
        //less than 2 nums
        if(n<=1){
            return n;
        }
        
        // 0 + 1
        if(n == 2){
            return 1;
        }
        
        // 0 + 1 + 1
        if(n == 3){
            return 2;
        }
        
        //array to dynamicaly store trib values
        int[] dp = new int[n+1];
        //set the first 3 numbers for a trib seq.
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        
        //for the rest, dynamically build the array using the 3 prev values
        for(int x = 3; x < n + 1; x++){
            dp[x] = dp[x-1] + dp[x-2] + dp[x-3];
        }
        
        //return only the nth trib number
        return dp[n];
    }
}