import java.util.* ;
import java.io.*; 

public class Solution {
	public static String[] printPatt(int n) {
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
		for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
			for(int j=arr[i];j>0;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		// Write your code here
	}

}
