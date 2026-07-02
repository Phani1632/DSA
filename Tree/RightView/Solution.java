import java.util.ArrayList;
import java.util.List;

import Tree.TreeNode;

public class Solution {
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        int count=-1;
        TreeNode temp = root;
        TreeNode templeft = new TreeNode();
        if(root==null) return list;
        if(root.left != null){
             templeft = root.left;
        }  
        else{
            templeft= null;
        }
        do{
            list.add(temp.val);
            temp=temp.right;
            count++;
        }while(temp!=null);

        while(templeft!=null){
            count--;
            if(templeft.right!=null){
                if(count<0){
                    list.add(templeft.val);
                }
                templeft=templeft.right;
            }
            else if(templeft.left!=null){
                if(count<0){
                    list.add(templeft.val);
                }
                templeft=templeft.left;
            } 
            else{
                if(count<0){
                    list.add(templeft.val);
                }
                break;
            }
            
        }
        
        return list;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
       root.left = new TreeNode(2);
       root.left.right = new TreeNode(5);

       root.right= new TreeNode(3);
       root.right.right = new TreeNode(4);

       TreeNode root2 = new TreeNode(1);
       root2.right = new TreeNode(3);
       root2.left = new TreeNode(2);
       root2.left.left = new TreeNode(4);
       root2.left.left.left = new TreeNode(5);

        for(int i : rightSideView(root)){
            System.out.println(i);
        }

    }
}
