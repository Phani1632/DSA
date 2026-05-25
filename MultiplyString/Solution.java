package MultiplyString;

import java.util.ArrayList;

public class Solution {
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int a = num1.length();
        int b = num2.length();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = b - 1; i >= 0; i--) {
            int p = 0;
            for (int j = a - 1; j >= 0; j--) {
                if (p != 0) {
                    p= ((num2.charAt(i)-'0') * (num1.charAt(j)-'0'))/10;
                    System.out.println("This is carry forward for "+j+" "+p+" "+num2.charAt(i)+ " "+num1.charAt(j));
                    res.add(((num2.charAt(i)-'0') * (num1.charAt(j)-'0'))%10);
                    System.out.println("This is multiplied value for "+j+" "+(num2.charAt(i)* num1.charAt(j))%10);
                }
                else{
                    p= ((num2.charAt(i)-'0') * (num1.charAt(j)-'0' +p))/10;
                    System.out.println("This is carry forward for "+j+" "+p+" "+num2.charAt(i)+ " "+num1.charAt(j));
                    res.add((((num2.charAt(i)-'0') *(num1.charAt(j)-'0')) +p)%10);
                    System.out.println("This is multiplied value for "+j+" "+(((num2.charAt(i)-'0') *(num1.charAt(j)-'0')) +p)%10);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
       for(int i =res.size()-1;i>=0;i--){
            sb.append(res.get(i));
       }
       return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
        // String str = "12131";
        // System.out.println(str.charAt(1)*str.charAt(2));
    }
}
