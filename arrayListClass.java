import java.util.*;
import java.util.stream.Stream;

public class arrayListClass {
    public static void main(String args[]){
        ArrayList<String> arr = new ArrayList<>();
        
        //addition
        arr.add("Phani");
        
        //Index addition
        arr.add(1,"Yeshwanth" );
        System.out.println(arr);
        
        //remove
        arr.remove(0);
        System.out.println(arr);
        
        //remove all
        arr.removeAll(arr);
        System.out.println(arr);
        
        //Add all
        String[] str = {"Gaddamanugu","Phani","Yeshwanth"};
        arr.addAll(Arrays.asList(str));        
        System.out.println(arr);

        //get 
        arr.get(1);
        System.out.println(arr);

        //set
        arr.set(1,"First");
        System.out.println(arr);

        //Size
        System.out.println(arr.size());

        //Sorting an ArrayList
        Collections.sort(arr);
        for(string i: arr){
            System.out.println(i);
        }

        

    }
}
