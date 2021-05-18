package io.cjf.testalgorithm.tree.bfs;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        TreeNode n3 = new TreeNode(3);
        TreeNode n9 = new TreeNode(9);
        TreeNode n20 = new TreeNode(20);
        TreeNode n15 = new TreeNode(15);
        TreeNode n7 = new TreeNode(7);

        n3.left = n9;
        n3.right = n20;

        n20.left = n15;
        n20.right = n7;

        Solution solution = new Solution();
        ArrayList<ArrayList<Integer>> levels = solution.levelOrder(n3);

    }

    /**
     *
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<ArrayList<Integer>> levels = new ArrayList<>();
        for (List<TreeNode> cs = Collections.singletonList(root); cs.size() > 0; ) {
            ArrayList<Integer> level = new ArrayList<>();
            LinkedList<TreeNode> nextLevel = new LinkedList<>();
            for (TreeNode c : cs) {
                level.add(c.val);
                if (c.left != null) {
                    nextLevel.add(c.left);
                }
                if (c.right != null) {
                    nextLevel.add(c.right);
                }
            }
            levels.add(level);
            cs = nextLevel;
        }
        return levels;
    }
}
