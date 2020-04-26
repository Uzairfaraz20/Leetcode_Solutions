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
    public List<List<Integer>> levelOrder(TreeNode root) {
       
        List<List<Integer>> masterList = new ArrayList<>();
        
        if(root == null){return masterList;}
       
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode t = queue.poll();
                temp.add(t.val);
            
             if(t.left != null){
                queue.add(t.left);
            }
            
             if(t.right != null){
                queue.add(t.right);
            }
            
            }
            
           
            
           
            
             masterList.add(temp);
        }
        
        return masterList;
    }

}