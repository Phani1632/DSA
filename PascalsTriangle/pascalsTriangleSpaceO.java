package PascalsTriangle;

public class pascalsTriangleSpaceO {
    public static int result(int r,int c){
        if(c>r) return 0;
        if(c==1||c==r) return 1;
        if(r==1) return 1;
        return result(r-1, c-1)+result(r-1, c);       
    }
    public static void main(String[] args) {
        System.out.println(result(5, 3));
    }
}
