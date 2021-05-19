package io.cjf.testalgorithm.tree.dfs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {

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

//        TreeNode n1 = new TreeNode(1);
//        TreeNode n2 = new TreeNode(2);
//        TreeNode n3 = new TreeNode(3);
//
//        n1.left = n2;
//        n1.right = n3;

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n3.left = n2;
        n3.right = n4;
        n2.left = n1;
        n4.right = n5;

        Solution solution = new Solution();
//        List<Integer> integers = solution.preTraverse(n3);
        List<Integer> integers = solution.inTraverse(n3);

//        int[][] ints = solution.threeOrders(n3);

    }

    private List<Integer> preTraverse(TreeNode root) {
        LinkedList<Integer> ret = new LinkedList<>();
        if (root != null) {
            Stack<TreeNode> toVisits = new Stack<>();
            for (toVisits.push(root); !toVisits.isEmpty(); ) {
                TreeNode node = toVisits.pop();
                ret.add(node.val);
                if (node.right != null) {
                    toVisits.push(node.right);
                }
                if (node.left != null) {
                    toVisits.push(node.left);
                }
            }
        }
        return ret;
    }

    private List<Integer> inTraverse(TreeNode root) {
        LinkedList<Integer> ret = new LinkedList<>();
        if (root != null) {
            Stack<TreeNode> toVisits = new Stack<>();
            TreeNode c = root;
            while (!toVisits.isEmpty() || c != null) {
                if (c != null) {
                    toVisits.push(c);
                    c = c.left;
                } else {
                    c = toVisits.pop();
                    ret.add(c.val);
                    c = c.right;
                }
            }

        }
        return ret;
    }

    private List<Integer> postTraverse(TreeNode root) {
        LinkedList<Integer> ret = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) {
            for (stack.push(root); !stack.isEmpty(); ) {
                TreeNode node = stack.pop();
                ret.addFirst(node.val);
                if (node.left != null) {
                    stack.push(node.left);
                }
                if (node.right != null) {
                    stack.push(node.right);
                }
            }
        }

        return ret;
    }
    
    /**
     *
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
//    public int[][] threeOrders (TreeNode root) {
//        List<Integer> preList = preTraverse(root);
//        List<Integer> inList = inTraverse(root);
//        List<Integer> postList = postTraverse(root);
//        int[] preAry = preList.stream().mapToInt(value -> value).toArray();
//        int[] inAry = inList.stream().mapToInt(value -> value).toArray();
//        int[] postAry = postList.stream().mapToInt(value -> value).toArray();
//        return new int[][]{preAry, inAry, postAry};
//    }
}
