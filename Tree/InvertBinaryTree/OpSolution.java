package Tree.InvertBinaryTree;

import java.util.List;

import Tree.TreeNode;
import Tree.BinaryTreeTransvers.Solution1;

public class OpSolution {
    public static TreeNode invertTree(TreeNode root) {
        // TreeNode temp =root;
        if(root==null) return root;
        TreeNode result = new TreeNode(root.val);
        add(root, result);
        return result;

    }
    public static void add(TreeNode oldRoot, TreeNode newRoot){    
        if(oldRoot==null){
            return;
        }
        if(oldRoot.left!=null){
            newRoot.right= new TreeNode(oldRoot.left.val);
            add(oldRoot.left, newRoot.right);
        }
        if(oldRoot.right!=null){
            newRoot.left = new TreeNode(oldRoot.right.val);
            add(oldRoot.right, newRoot.left);
        }
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
