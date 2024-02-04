package L8_Intro_To_Arrays.Class;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1; i<=10; i++){
            al.add(i);
        }

        Iterator<Integer> it = al.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
