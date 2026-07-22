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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,Boolean>vis=new HashMap<>();
        Map<TreeNode,TreeNode>parent=new HashMap<>();
        parent=f(root,parent);
        Queue<TreeNode>q=new LinkedList<>();
        q.add(target);
        vis.put(target,true);
        int currentlvl=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(currentlvl==k){
                break;
            }
            currentlvl++;
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(node.left!=null&&vis.get(node.left)==null){
                    vis.put(node.left,true);
                    q.add(node.left);
                }
                if(node.right!=null&&vis.get(node.right)==null){
                    vis.put(node.right,true);
                    q.add(node.right);
                }
                if(parent.get(node)!=null&&vis.get(parent.get(node))==null){
                    TreeNode n=parent.get(node);
                    vis.put(n,true);
                    q.add(parent.get(node));
                }
            }
        }
        ArrayList<Integer>l=new ArrayList<>();
        while(!q.isEmpty()){
            l.add(q.poll().val);
        }
        return l;
    }
    Map<TreeNode,TreeNode> f(TreeNode root,Map<TreeNode,TreeNode>m){
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node.left!=null){
                m.put(node.left,node);
                q.add(node.left);
            }
            if(node.right!=null){
                m.put(node.right,node);
                q.add(node.right);
            }
        }
        return m;
    }
}