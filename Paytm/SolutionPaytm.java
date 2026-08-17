package Paytm;

public class SolutionPaytm {
    public static String removePart(String s, String part){

        char first= part.charAt(0);
        StringBuilder sb = new StringBuilder();
        int flag =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==first){
                if(i+part.length()<=s.length() && s.substring(i, i+part.length()).equals(part)){
                    sb.append(s.substring(0,i));
                    sb.append(s.substring(i+part.length(), s.length()));
                    flag =1;
                    break;
                }
            }
        }
        if(flag==0){
            return s;
        }
        return removePart(sb.toString(), part);
    }
    public static void main(String[] args){
        String s= "daabcbaabcbc";
        String part = "abc";

        String s2 = "axxxxyyyyb";
        String part2 = "xy";

        String s3 ="aaaaa";
        String part3 = "aa";

        String s4="mississippi";
        String part4="iss";

        System.out.println(removePart(s, part));

        System.out.println(removePart(s2, part2));

        System.out.println(removePart(s3, part3));

        System.out.println(removePart(s4, part4));
    }
}
