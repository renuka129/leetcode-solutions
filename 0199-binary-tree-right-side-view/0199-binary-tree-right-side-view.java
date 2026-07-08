/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node){
        this.node=node;
    }
}
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer>l=new ArrayList<>();
        if(root==null){
            return l;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode node=q.poll();
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                if(i==n-1){
                    l.add(node.val);
                }
            }
        }
        return l;
        
    }
}