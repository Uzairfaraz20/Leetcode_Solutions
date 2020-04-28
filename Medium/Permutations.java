class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        //master list
        List<List<Integer>> masterList = new ArrayList<>();
        
        //null check
        if(nums == null){return masterList;}
        
        //call helper
        helper(masterList, new ArrayList<Integer>(), nums);
        
        return masterList;
        
    }
    
    public void helper(List<List<Integer>> masterList, List<Integer> list , int[] nums){
        
        //filled list with all numbers for nums, can add it to master list because
        //if it has made it this far, its a valid permutation.
        if(nums.length == list.size()) {masterList.add(new ArrayList<>(list));}
        
        //otherwise, we have not reached the end of building a permutation of length nums.length
        else{
            
            //for every digit essentially:
            for(int x = 0; x < nums.length; x++){
                
                //weve already used the digit from nums in the permutation
                if(list.contains(nums[x])) {continue;}
                
                //not seen, we can add it to list
                list.add(nums[x]);
                
                //weve added and can now move on to the next digit until we use all the numbers
                helper(masterList, list, nums);
                
                //after the recursion unwinds, we will rmeove the last value to continue iterating 
                list.remove(list.size() - 1);
            }
            
        }
        
        
    }
}