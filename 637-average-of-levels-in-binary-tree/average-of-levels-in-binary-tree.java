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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> ans=new LinkedList<>();
        List<Double> res=new ArrayList<>();
        ans.add(root);
        while(!ans.isEmpty()){
            int size=ans.size();
            double avg=0;
            for(int i=0;i<size;i++){
                TreeNode curr=ans.remove();
                avg+=(double)curr.val;
                if(curr.left !=null){
                    ans.add(curr.left);
                }
                if(curr.right !=null){
                    ans.add(curr.right);
                }
            }
            avg=avg/size;
            res.add(avg);

        }
        return res;
    }
}