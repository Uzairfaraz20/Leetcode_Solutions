class Solution {
    public int rob(int[] nums) {
        
        //no houses...
        if (nums.length == 0) {
            return 0;
        }
        //only 1 house to rob
        if (nums.length == 1) {
            return nums[0];
        }
        //highest current sum of robbed houses
        int now  = 0;
        //val directly before
        int last = 0;
        
        
        for (int i=0; i<nums.length; i++) {
            
            //value 2 before curr
            int temp = last;
            
            //move up to the next house
            last = now;
            
            //see whether curr max or this house + previous is bigger and set to now
            now  = Math.max(now,nums[i]+temp);
        }
        return now;
    }
}