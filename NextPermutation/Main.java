public class Main {
    public static void solution(int[] arr) {
        int idx = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i - 1]) {
                idx = i;
                break;
            }
        }
        for (int i = arr.length - 1; i >= idx; i--) {
            if (arr[i] > arr[idx]) {
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        for (int i = idx+1; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

    }

    public static void main(String args[]) {
        int[] a = { 1, 5, 6, 4, 5 };
        solution(a);
        for (int i : a)
            System.out.print(i);
    }
}
