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
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        return f(res,root,q);
    }
    List<List<Integer>> f(List<List<Integer>>res,TreeNode root,Queue<TreeNode>q){
        boolean f=false;
        if(root==null){
            return res;
        }
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer>l=new ArrayList<>();
            for(int i=0;i<n;i++){
            TreeNode node=q.poll();
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                 l.add(node.val);
            }
                if(f){
                    Collections.reverse(l);
                }
                f=!f;
            res.add(new ArrayList<>(l));
        }
        return res;
    }
}