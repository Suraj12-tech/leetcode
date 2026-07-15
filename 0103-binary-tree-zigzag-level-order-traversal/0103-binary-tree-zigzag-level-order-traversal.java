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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        boolean lefttoright = true;
        
        while (!qu.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                TreeNode tr = qu.remove();
                if (tr == null) {
                    continue;
                }
                if (lefttoright) {
                    temp.add(tr.val);
                } else {
                    temp.add(0, tr.val);
                }

                if (tr.left != null) {
                    qu.add(tr.left);
                }

                if (tr.right != null) {
                    qu.add(tr.right);
                }
            }

            ans.add(temp);
            lefttoright = !lefttoright;
        }

        return ans;
    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna