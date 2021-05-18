package io.cjf.testalgorithm.tree.dfs;

import java.util.LinkedList;
import java.util.List;

public class Solution3 {

    public static void main(String[] args) {
//        TreeNode n3 = new TreeNode(3);
//        TreeNode n9 = new TreeNode(9);
//        TreeNode n20 = new TreeNode(20);
//        TreeNode n15 = new TreeNode(15);
//        TreeNode n7 = new TreeNode(7);
//
//        n3.left = n9;
//        n3.right = n20;
//
//        n20.left = n15;
//        n20.right = n7;
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);

        n1.left = n2;
        n1.right = n3;

        Solution3 solution = new Solution3();

        int[][] ints = solution.threeOrders(n1);

    }

    private void preTraverse(TreeNode root, List<Integer> preList) {
        if (root != null) {
            System.out.print(root.val);
            preList.add(root.val);
            preTraverse(root.left, preList);
            preTraverse(root.right, preList);
        }
    }

    private void inTraverse(TreeNode root, List<Integer> inList) {
        if (root != null) {
            inTraverse(root.left, inList);
            System.out.print(root.val);
            inList.add(root.val);
            inTraverse(root.right, inList);
        }
    }

    private void postTraverse(TreeNode root, List<Integer> postList) {
        if (root != null) {
            postTraverse(root.left, postList);
            postTraverse(root.right, postList);
            System.out.print(root.val);
            postList.add(root.val);
        }
    }
    
    /**
     *
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    public int[][] threeOrders (TreeNode root) {
        // write code here
        LinkedList<Integer> preList = new LinkedList<>();
        LinkedList<Integer> inList = new LinkedList<>();
        LinkedList<Integer> postList = new LinkedList<>();
        preTraverse(root, preList);
        inTraverse(root, inList);
        postTraverse(root, postList);
        int[] preAry = preList.stream().mapToInt(value -> value).toArray();
        int[] inAry = inList.stream().mapToInt(value -> value).toArray();
        int[] postAry = postList.stream().mapToInt(value -> value).toArray();
        return new int[][]{preAry, inAry, postAry};
    }
}
