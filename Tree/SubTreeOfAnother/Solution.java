package Tree.SubTreeOfAnother;

import Tree.TreeNode;

public class Solution {
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // boolean result = true;
        if (root.val == subRoot.val) {
            if (compare(root, subRoot)) {
                return true;
            }
        } else {
            if (root.left != null && root.right != null) {
                return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
            } else if (root.left != null) {
                return isSubtree(root.left, subRoot);
            } else if (root.right != null) {
                return isSubtree(root.right, subRoot);
            } else {
                return false;
            }

        }

        return false;
    }

    public static boolean compare(TreeNode root1, TreeNode root2) {
        if((root1==null && root2!=null) || (root1!=null && root2==null)){
            return false;
        }
        
        if (root1 != null && root2 != null) {
            if (root1.val != root2.val) {
                return false;
            } else {
                if ((root1.left != null && root1.right != null)||(root2.left != null && root2.right != null)) {
                    return compare(root1.left, root2.left) && compare(root1.right, root2.right);
                } else if (root1.left != null || root2.left != null) {
                    return compare(root1.left, root2.left);
                } else if (root1.right != null || root2.right!=null) {
                    return compare(root1.right, root2.right);
                } else {
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(4);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        // root.left.right.left = new TreeNode(0);

        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        TreeNode subRoot2 = new TreeNode(4);
        subRoot2.left = new TreeNode(1);
        subRoot2.right = new TreeNode(2);

        // System.out.println(compare(subRoot, subRoot2));

        System.out.println(isSubtree(root, subRoot));

    }
}
