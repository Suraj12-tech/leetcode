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
    boolean lft = false;
    boolean rht = false;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean ans = check(p,q);
        return ans;
    }

    public boolean check ( TreeNode P , TreeNode Q){
        if(P==null && Q==null){
            return true;
        }

        if((P!=null && Q!=null) && (P.val == Q.val)){
           lft = check(P.left,Q.left);
            rht = check(P.right,Q.right);
        }else{
            return false;
        }
        
        if(lft && rht){
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna