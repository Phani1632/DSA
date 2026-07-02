package Problwm;
import java.util.Arrays;

public class Solution {
    public static int check(int[] arr, int h){
        int count=0;
        int hours=1;
        int high =0;
        for(int num: arr){
            high=Math.max(high,num);
        }
        for(int i = 1;i<high;i++){
            int result=0;
            for(int num:arr){
                result +=Math.ceil(num/i);
                count++;
            }
            if(result == h){
                hours = Math.min(count, i);
            }
        }
        return hours;
    }
    public static void main(String[] args){
        int[] arr = {3, 6, 7, 11};
        System.out.println(check(arr, 8));
    }
}
