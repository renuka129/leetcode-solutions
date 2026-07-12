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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode>l=new ArrayList<>();
        List<TreeNode>l1=new ArrayList<>();
        helper(root,p,l);
        helper(root,q,l1);
        TreeNode res=null;
        int min=Math.min(l.size(),l1.size());
        for(int i=0;i<min;i++){
            if(l.get(i).equals(l1.get(i))){
                res=l.get(i);
            }
        }
        return res;
    }
    boolean helper(TreeNode root,TreeNode x,List<TreeNode>l){
        if(root==null){
            return false;
        }
        l.add(root);
        if(root==x){
            return true;
        }
         if(helper(root.left,x,l)||helper(root.right,x,l)){
            return true;
         }
         l.remove(l.size()-1);
         return false;
    }
}