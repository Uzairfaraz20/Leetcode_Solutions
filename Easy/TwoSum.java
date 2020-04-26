class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> pairs = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int comp = target - nums[i];
            
            if(pairs.containsKey(comp)){
                int[] answer = {pairs.get(comp),i};
                return answer;
            }else{
                pairs.put(nums[i],i);
            }
            
        }
        
        int[] t = new int[2];
        return t;
        
    }
}