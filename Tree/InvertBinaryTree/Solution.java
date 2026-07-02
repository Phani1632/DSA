package Tree.InvertBinaryTree;

import java.util.List;

import Tree.TreeNode;
import Tree.BinaryTreeTransvers.*;

public class Solution {
    public static TreeNode invertTree(TreeNode root) {
        // TreeNode temp =root;
        if(root==null) return root;
        if(root.left!=null && root.right!=null){
            swap(root.left, root.right);
        }
        return root;

    }
    public static void swap(TreeNode left,TreeNode right){
        
        int temp = left.val;
        left.val=right.val;
        right.val= temp;
        // System.out.println(left.val+" <-> " +right.val);
        if(left.left==null){
            return;
        }
       
       swap(left.left,right.right);
       swap(left.right,right.left);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode result=  invertTree(root);
    

        List<List<Integer>> list = Solution1.levelOrder(result);

        for(List<Integer> ls : list){
            for(int i:ls){
                System.out.print(i);
            }
            System.out.println();
        }
    }
} 
