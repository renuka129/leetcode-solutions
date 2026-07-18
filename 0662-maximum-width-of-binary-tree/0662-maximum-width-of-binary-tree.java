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
    int num;
    Pair(TreeNode node ,int num){
        this.node=node;
        this.num=num;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair>q=new LinkedList<>();
        int ans=0;
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            int size=q.size();
            int minnode=q.peek().num;
            int first=0;int last=0;
            for(int i=0;i<size;i++){
                Pair p=q.poll();
                TreeNode node1=p.node;
                int curr_id=p.num-minnode;
                if(i==0){
                    first=curr_id;
                }
                if(i==size-1){
                    last=curr_id;
                }
                if(node1.left!=null){
                    q.add(new Pair(node1.left,curr_id*2+1));
                }
                if(node1.right!=null){
                    q.add(new Pair(node1.right,curr_id*2+2));
                }

            }
            ans=Math.max(last-first+1,ans);
        }
        return ans;
    }
}