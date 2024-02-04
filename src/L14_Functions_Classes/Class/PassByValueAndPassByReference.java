package L14_Functions_Classes.Class;

import java.util.Arrays;

public class PassByValueAndPassByReference {
    public static void main(String[] args) {
        //Java is always pass by value

        //generally for non-primitives except String, references are copied and passed to the method
        //modification inside the method will reflect outside

        int n = 10;
        passByValue(n);
        System.out.println(n);
        System.out.println("______________________");


        // in case of array the reference to the array is passed to the method by value
        int[] arr = {1,2,3};
        passByReference(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("______________________");

        /*
        When you pass a String to a method, you are passing the reference to the String object by value.
        So, even though you are passing the reference to the String by value, the immutability of String objects prevents the method from modifying the original String.
         */
        String str = "Hello";
        isStringPassByValueOrReference(str);
        System.out.println(str);
        System.out.println("______________________");


        //in case of StringBuilder the reference to the StringBuilder object is passed to the method by value
        StringBuilder sb = new StringBuilder("Hello");
        isStringBuilderPassByValueOrReference(sb);
        System.out.println(sb);
        System.out.println("______________________");

    }

    private static void passByValue(int n){
        n++;
        System.out.println(n);
    }

    private static void passByReference(int[] arr){
        arr[0] = 100;
        System.out.println(Arrays.toString(arr));
    }

    private static void isStringPassByValueOrReference(String str){
        str = "Bye";
        System.out.println(str);
    }

    private static void isStringBuilderPassByValueOrReference(StringBuilder sb){
        sb.setCharAt(0, 'B');
        System.out.println(sb);
    }


}
