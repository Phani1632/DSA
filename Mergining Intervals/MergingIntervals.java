import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class MergingIntervals {
    public static int[][] solution(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] last = result.get(result.size()-1);
            if(last[1]>=intervals[i][0]){
                last[1]=Math.max(last[1],intervals[i][1]);
            }
            else{
                result.add(intervals[i]);
            }
        }
        return result.toArray(new int[result.size()][]); 
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 2 }, { 3, 9 }, { 1, 3 }, { 2, 5 } };

        int[][] res = solution(intervals);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }

    }
}
