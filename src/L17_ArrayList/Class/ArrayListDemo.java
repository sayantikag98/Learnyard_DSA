package L17_ArrayList.Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        // To add list of integers in the arraylist while declaring
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3));
        System.out.println(arr);
        List<Integer> l = Arrays.asList(1,2,2);
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(l);
        System.out.println(arr1);

        ListIterator<Integer> lIter = arr.listIterator();
        while(lIter.hasNext()){
            System.out.print(lIter.next()+" ");
        }
        System.out.println();

        while(lIter.hasPrevious()){
            System.out.print(lIter.previous()+" ");
        }
        System.out.println();
    }
}
