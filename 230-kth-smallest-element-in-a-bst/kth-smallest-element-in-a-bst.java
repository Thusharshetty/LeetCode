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
    ArrayList<Integer> sort=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
       return sort.get(k-1);
    }
    private void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        sort.add(root.val);
        inorder(root.right);
    }
}