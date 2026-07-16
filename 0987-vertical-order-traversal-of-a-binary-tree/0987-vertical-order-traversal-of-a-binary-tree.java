import java.util.*;

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

    static class Pair {
        TreeNode node;
        int vertical;
        int level;

        Pair(TreeNode node, int vertical, int level) {
            this.node = node;
            this.vertical = vertical;
            this.level = level;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> nodes = new TreeMap<>();

        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(root, 0, 0));

        while (!queue.isEmpty()) {

            Pair p = queue.poll();

            TreeNode temp = p.node;
            int vertical = p.vertical;
            int level = p.level;

            nodes.putIfAbsent(vertical, new TreeMap<>());
            nodes.get(vertical).putIfAbsent(level, new PriorityQueue<>());
            nodes.get(vertical).get(level).offer(temp.val);

            if (temp.left != null) {
                queue.offer(new Pair(temp.left, vertical - 1, level + 1));
            }

            if (temp.right != null) {
                queue.offer(new Pair(temp.right, vertical + 1, level + 1));
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (TreeMap<Integer, PriorityQueue<Integer>> levels : nodes.values()) {

            List<Integer> list = new ArrayList<>();

            for (PriorityQueue<Integer> pq : levels.values()) {

                while (!pq.isEmpty()) {
                    list.add(pq.poll());
                }
            }

            ans.add(list);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna