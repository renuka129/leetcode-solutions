/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder res=new StringBuilder();
        if(root==null){
            return "";
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node==null){
                res.append("# ");
                continue;
            }
            res.append(node.val+" ");
            q.add(node.left);
            q.add(node.right);
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<TreeNode>q=new LinkedList<>();
        String r[]=data.split(" ");
        if(data==""){
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(r[0]));
        q.add(root);
        int i=1;
        while(!q.isEmpty()&&i<r.length){
            TreeNode node=q.poll();
                if(!r[i].equals("#")){
                    TreeNode left=new TreeNode(Integer.parseInt(r[i]));
                    node.left=left;
                    q.add(left);
                }
                i++;
                if(i<r.length&&!r[i].equals("#")){
                    TreeNode right=new TreeNode(Integer.parseInt(r[i]));
                    node.right=right;
                    q.add(right);
                }
                i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));