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
    TreeNode prev=null;
    public void flatten(TreeNode root) {
        //reversive apprach
        if(root==null){
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right=prev;
        root.left=null;
        prev=root;

       // iteractive apporach->stack
    //    Stack<TreeNode>s=new Stack<>();
    //    s.push(root);
    //    while(!s.isEmpty()){
    //     TreeNode cur=s.pop();
    //     if(cur.right!=null){
    //         s.push(cur.right);
    //     }
    //     if(cur.left!=null){
    //         s.push(cur.left);
    //     }
    //     if(!s.isEmpty()){
    //         cur.right=s.pop();
    //         cur.left=null;
    //     }
    //  }
        
    }
}