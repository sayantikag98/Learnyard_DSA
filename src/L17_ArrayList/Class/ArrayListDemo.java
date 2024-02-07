package L17_ArrayList.Class;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // To add list of integers in the arraylist while declaring
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3));
        System.out.println(arr);
    }
}
