import java.util.ArrayList;

public class NextPermutation {

    public static void permutation(ArrayList<ArrayList<Integer>> res,int[] arr,int idx){
        if(idx==arr.length){
            ArrayList<Integer> list= new ArrayList<>();
            for(int val: arr) list.add(val);
            res.add(list);
            return;
        }
        for(int i =idx;i<arr.length;i++){
            //swapping
            int temp= arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;

            permutation(res, arr, idx+1);

            //backtracking
            temp= arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;

            

        }
        
    }
    public static ArrayList<ArrayList<Integer>> solution(int[] nums){

        
        ArrayList<ArrayList<Integer>> res =new ArrayList<>();
        permutation(res, nums, 0);

        return res;
        
    }
    public static void main(String[] args) {
        int [] a = {1,2,3};
        ArrayList<ArrayList<Integer>> res =solution(a);

        for (ArrayList<Integer> x : res) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
