package Tree.PathSum;

import Tree.TreeNode;

public class Solution {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        Boolean result = false;
        if(root == null){
            return false;
        }
        if(root.left!= null){
           result= result||hasPathSum(root.left, targetSum-root.val);
        }
        if(root.right!=null){
           result= result|| hasPathSum(root.right, targetSum-root.val);
        }     
        if(root.right==null && root.left == null){
            if(targetSum == root.val){
                return true;
            }
            return result;
        }
        return result;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left= new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right= new TreeNode(2);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right= new TreeNode(4);
        root.right.right.right= new TreeNode(1);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        System.out.println(hasPathSum(root,22));
        System.out.println(hasPathSum(root2, 3));
    }
}
