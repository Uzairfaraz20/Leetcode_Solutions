//solved using dfs and recursion
class Solution {
    public List<String> letterCasePermutation(String S) {
        if(S == null){return new ArrayList<>();}
        
        List<String> list = new ArrayList<>();
        
        helper(S.toCharArray(),list,0);
        return list;
    }
    
    //helper function to build out list
    public void helper(char[] c, List<String> list, int count) {
        //return final permutations
        if(count == c.length){
            list.add(new String(c));
            return;
        }
        //if number, no need to branch
        if(Character.isDigit(c[count])){
            helper(c,list,count+1);
            return;
        }
        
        //recurse on the lower case version of c[count]
        c[count] = Character.toLowerCase(c[count]);
        helper(c,list,count + 1);
        
        //recurse on the upper case version of c[count]
        c[count] = Character.toUpperCase(c[count]);
        helper(c,list,count + 1);
    }
}