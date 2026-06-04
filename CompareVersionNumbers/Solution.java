package CompareVersionNumbers;


public class Solution {
    public static int compareVersion(String version1, String version2) {
        String[] v1= version1.split("\\.");        
        String[] v2= version2.split("\\.");
        // for(String s:v1){
        //     System.out.println(s);
        // }
        // for(String s : v2){
        //     System.out.println(s);
        // }
        
        int position =0;
        while(position< v1.length && position< v2.length){
            if(Integer.parseInt(v1[position])>Integer.parseInt(v2[position])){
                return 1;
            }
            else if(Integer.parseInt(v1[position])<Integer.parseInt(v2[position])){
                return -1;
            }
            else{
                position++;
                continue;
            }  
        }
        if(v1.length>v2.length){
            for(int i =position;i<v1.length;i++){
                if(Integer.parseInt(v1[i])>0){
                    return 1;
                }
            }
        }
        else{
            for(int i =position;i<v2.length;i++){
                if(Integer.parseInt(v2[i])>0){
                    return -1;
                }
            }
        }        
        return 0;
    }
    public static void main(String[] args) {
        String version1="1.0";
        String version2="1.0.0.1";
        System.out.println(compareVersion(version1, version2));
    }   
}
