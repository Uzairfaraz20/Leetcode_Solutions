/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        int counter = 0;
        TreeNode node = root;
        
        while(node != null || !stack.isEmpty()){
            
            while(node!=null){
                stack.push(node);
                node = node.left;
                
            }
            
            node = stack.pop();
            counter++;
            if(counter == k){
                return node.val;
            }
            
            node = node.right;
            
        }
        
        return -999999;
    }
}