/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//Iterative
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        //list to return rightmost vals i each level set
        List<Integer> list = new ArrayList<>();
        
        //null check
        if(root == null){return list;}
        
        //queue for bfs
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        //add the first element
        queue.add(root);
        
        //keep doing it while theres stuff in the queue
        while(!queue.isEmpty()){
            
            //size of the level set
            int size = queue.size();
            
            //check every element in the level set
            for(int x = 0; x < size; x++){
                
                //remove the first element
                TreeNode node = queue.poll();
                
                //is this the last element in the level set?
                if(x == size - 1){
                    list.add(node.val);
                }
                
                // add an elements left and right children if they exist (regardless of
                // whether its the last element or not
                if(node.left != null){
                    queue.add(node.left);
                }
                
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            
        }
        
        return list;
        
    }
}