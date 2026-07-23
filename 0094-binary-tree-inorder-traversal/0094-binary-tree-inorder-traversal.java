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
 //morris inorder traversal;
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer>l=new ArrayList<>();
        TreeNode cur=root;
        while(cur!=null){
            if(cur.left==null){
            l.add(cur.val);
            cur=cur.right;
            }
        else{
        TreeNode prev=cur.left;
        while(prev.right!=null&&prev.right!=cur){
            prev=prev.right;
        }
        if(prev.right==null){
            prev.right=cur;//creation of thread
            cur=cur.left;
        }
        else if(prev.right==cur){
            l.add(cur.val);
            prev.right=null;//if thread is already created remove the thread by adding nullto right pointer
            cur=cur.right;
        }}}
        return l;
    } //for preorder traversal directly when we are creating a thread we are dealing with the root so the 
    //root (curr) is directly added to the ans pre=root,left,right
}