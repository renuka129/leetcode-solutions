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
    int ans=0;
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        //int ans=0;
        helper(root,k);
        return ans;
    }

    //Bruteforce
    // List<Integer>l=new ArrayList<>();
    // helper(root,l);
    // Collections.sort(l);
    // return l.get(k-1);
        
    // }
    // void helper(TreeNode root,List<Integer>l){
    //     if(root==null){
    //         return ;
    //     }
    //     if(root!=null){
    //         l.add(root.val);
    //     }
    //     helper(root.left,l);
    //     helper(root.right,l);
    // }

    void helper(TreeNode node,int k){
        if(node==null){
            return;
        }
        helper(node.left,k);
        count++;
        if(count==k){
            ans=node.val;
            return;
        }
        helper(node.right,k);
    }
}
