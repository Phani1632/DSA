public class Hindex {
    public static int solution(int[] citations) {
        int max = 0;
        int result = 0;
        for (int i = 0; i < citations.length; i++) {
            int count = 1;
            for (int j = i; j < citations.length; j++) {
                if (citations[j] > citations[i]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                result = Math.max(result,citations[i]);
            }
        }
        return result;

    }
    public static void main(String args[]) {
        int[] nums ={3,0,6,1,5};
        System.out.println(solution(nums));
    }
}
