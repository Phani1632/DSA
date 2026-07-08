package FirstNegativeIntegerInK;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> list = new ArrayList<>();
        int position = 0;
        // code here
        // for (int i = position; i <= position + k; i++) {
        //     if (arr[i] < 0) {
        //         position = i;
        //         for (int j = 0; j < position; j++) {
        //             list.add(arr[i]);
        //         }

        //     }
        // }
        for(int i = k-1;i<arr.length;i++){
            while(position<i && (position <= i-k || arr[position]>=0)){
                position++;
            }
            if(position<arr.length && arr[position]<0){
                list.add(arr[position]);
            }
            else{
                list.add(0);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { -8, 2, 3, -6, 10 };
        firstNegInt(arr, 2).stream().forEach(System.out::print);
    }
}
