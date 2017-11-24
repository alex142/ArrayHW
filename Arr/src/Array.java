import java.util.ArrayList;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>(5);
        //create string collection
        for(int i = 4; i >= 0; i--){
            String item = String.format("Element%d",i);
            arr.add(item);
        }
        //remove element
        arr.remove(3);
        //check removal
        if (arr.contains("Element1")){
            System.out.println("Oops! It's still there.");
        }
        else {
            System.out.println("No such element found");
        }
        //sort and verify
        System.out.println("Before sorting:");
        for (String elem : arr){
            System.out.println(elem);
        }

        Collections.sort(arr);

        System.out.println("After sorting:");
        for (String elem : arr){
            System.out.println(elem);
        }

    }
}
