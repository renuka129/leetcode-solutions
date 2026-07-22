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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            m.put(inorder[i],i);
        }
        TreeNode root=f(preorder,0,preorder.length-1,inorder,0,inorder.length-1,m);
        return root;
        
    }
    TreeNode f(int[]pre,int prestart,int preend,int[]inorder,int instart,int inend,Map<Integer,Integer>m){
        if(prestart>preend||instart>inend){
            return null;
        }
        TreeNode root=new TreeNode(pre[prestart]);
        int inroot=m.get(root.val);
        int numsleft=inroot-instart;
        root.left=f(pre,prestart+1,prestart+numsleft,inorder,instart,inroot-1,m);
        root.right=f(pre,prestart+numsleft+1,preend,inorder,inroot+1,inend,m);
        return root;
    }
}