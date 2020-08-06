class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];
        
        result[0] = 1;
        for(int x = 1; x < nums.length;x++){
            result[x] = result[x-1] * nums[x-1];
        }
        
        int temp = 1;
        for(int y = nums.length - 1; y >= 0; y--){
            result[y] *= temp;
            temp *= nums[y];
        }
        
        return result;
        
    }
}
