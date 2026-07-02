import java.util.ArrayList;
import java.util.List;

import Tree.TreeNode;

public class OpSolution {
    public static  List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, 0, result);
        return result;
    }

    private static void dfs(TreeNode node, int level, List<Integer> result) {
        if (node == null) {
            return;
        }

        if (level == result.size()) {
            result.add(node.val);
        }

        dfs(node.right, level + 1, result);
        dfs(node.left, level + 1, result);
    }
    

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);

        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);

        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(4);
        root2.left.left.left = new TreeNode(5);

        TreeNode root3 = new TreeNode(1);
        root3.right= new TreeNode(2);
        root3.right.right=new TreeNode(5);
        root3.right.right.left = new TreeNode(4);
        root3.right.right.right= new TreeNode(6);
        root3.right.right.left.left= new TreeNode(3);


        for (int i : rightSideView(root3)) {
            System.out.println(i);
        }

    }
}
