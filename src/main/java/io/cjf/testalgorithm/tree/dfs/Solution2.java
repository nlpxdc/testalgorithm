package io.cjf.testalgorithm.tree.dfs;

public class Solution2 {

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
//        TreeNode n1 = new TreeNode(1);
//        TreeNode n2 = new TreeNode(2);
//        TreeNode n3 = new TreeNode(3);

//        n1.left = n2;
//        n1.right = n3;

        Solution2 solution = new Solution2();
        solution.preTraverse(n3);
        System.out.println();
        solution.inTraverse(n3);
        System.out.println();
        solution.postTraverse(n3);
        System.out.println();

    }

    private void preTraverse(TreeNode root) {
        if (root != null) {
            System.out.print(root.val);
            preTraverse(root.left);
            preTraverse(root.right);
        }
    }

    private void inTraverse(TreeNode root) {
        if (root != null) {
            inTraverse(root.left);
            System.out.print(root.val);
            inTraverse(root.right);
        }
    }

    private void postTraverse(TreeNode root) {
        if (root != null) {
            postTraverse(root.left);
            postTraverse(root.right);
            System.out.print(root.val);
        }
    }
    
    /**
     *
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    public int[][] threeOrders (TreeNode root) {
        // write code here
        preTraverse(root);
        return null;
    }
}
