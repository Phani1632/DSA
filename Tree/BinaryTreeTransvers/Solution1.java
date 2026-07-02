package Tree.BinaryTreeTransvers;

import java.util.ArrayList;
import java.util.List;

import Tree.TreeNode;

public class Solution1 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        // int count=0;
        // TreeNode temp= root;
        // while(temp.left!=null || temp.right!=null){
        //     if(root.le)
        // }
        TreeNode temp = root;
        int size =level(temp);
        List<List<Integer>> list= new ArrayList<>();
        for(int i =0;i<size;i++){
            List<Integer> l = new ArrayList<>();
            list.add(l);
        }
        
        order(root, list,0);
        return list;
    }
    public static int level(TreeNode root){
        if(root==null) return 0;

        int left = level(root.left);
        int right = level(root.right);

        return 1+Math.max(left, right);
    }
    public static void order(TreeNode root,List<List<Integer>> list,int iteration){     
        
        if(root!=null){
            list.get(iteration).add(root.val);
        }
        else {
            return;
        }
        if(root.left!=null){
            order(root.left,list,iteration+1);
        }
        if(root.right!=null){
            order(root.right, list, iteration+1);
        }
        if(root.right==null && root.left == null){
            return;
        }      

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right= new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> list = levelOrder(root);

        for(List<Integer> ls : list){
            for(int i:ls){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
