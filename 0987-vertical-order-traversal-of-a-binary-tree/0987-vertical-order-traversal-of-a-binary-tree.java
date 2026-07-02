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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        Queue<Tuple>q=new LinkedList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>m=new TreeMap<>();
        q.add(new Tuple(root,0,0));
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                Tuple tuple=q.poll();
                TreeNode node=tuple.node;
                int col=tuple.col;
                int row=tuple.row;

                if(!m.containsKey(col)){
                    m.put(col,new TreeMap<>());
                }
                if(!m.get(col).containsKey(row)){
                    m.get(col).put(row,new PriorityQueue<>());
                }
                m.get(col).get(row).offer(node.val);

                if(node.left!=null){
                    q.add(new Tuple(node.left,col-1,row+1));
                }
                if(node.right!=null){
                    q.add(new Tuple(node.right,col+1,row+1));
                }
            }
        }
            for(TreeMap<Integer,PriorityQueue<Integer>> p:m.values()){
                res.add(new ArrayList<>());
                for(PriorityQueue<Integer>s:p.values()){
                    while(!s.isEmpty()){
                        res.get(res.size()-1).add(s.poll());
                    }
                }
            }
        
        return res;
    }
}
class Tuple{
    TreeNode node;
    int col;
    int row;
    public Tuple(TreeNode node,int col,int row){
        this.node=node;
        this.col=col;
        this.row=row;
    }
}