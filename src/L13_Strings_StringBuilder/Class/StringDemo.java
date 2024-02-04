package L13_Strings_StringBuilder.Class;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {

        //Declaring string
        String str;
//        System.out.println(str2); // error variable might not have been initialized


        //initializing string
        String str1 = "a";
        String str2 = new String("abc");

        //convert character to string
        String str3 = String.valueOf('a');


        /*
        STRING IN JAVA ARE IMMUTABLE
        When we create a String object using the new() operator, it always creates a new object in heap memory.
         On the other hand, if we create an object using String literal syntax e.g. “Baeldung”, it may return
          an existing object from the String pool, if it already exists. Otherwise, it will create a new
          String object and put in the string pool for future re-use.

        At a high level, both are the String objects, but the main difference comes from the point that
         new() operator always creates a new String object. Also, when we create a String using
          literal – it is interned.


          In general, we should use the String literal notation when possible. It is easier to read and it gives the
        compiler a chance to optimize our code.
         */

        String constantString1 = "Baeldung";
        String constantString2 = "Baeldung";

        //lexicographical comparison of strings

        System.out.println(constantString1 == constantString2); //true -> compare using references
        System.out.println(constantString1.equals(constantString2)); //true


        String constantString3 = new String("Baeldung");
        String constantString4 = new String("Baeldung");

        System.out.println(constantString3 == constantString4); //false
        System.out.println(constantString3.equals(constantString4)); //true
        System.out.println(constantString1 == constantString3); //false
        System.out.println(constantString1.equalsIgnoreCase(constantString2)); //true



        System.out.println(constantString1.length()); //8
        System.out.println(constantString1.charAt(0));  //B
        System.out.println(constantString1.substring(0,3)); //Bae -> beginIndex – the beginning index, inclusive. endIndex – the ending index, exclusive
        System.out.println(Arrays.toString(constantString1.split(""))); //[B, a, e, l, d, u, n, g]
        System.out.println(constantString1.contains("Be")); //false
        System.out.println(constantString1.trim());


        String compareString1 = "ab";
        String compareString2 = "abcd";
        System.out.println(compareString1.compareTo(compareString2));  //-2
        /*
        compareTo() -> the value 0 if the argument string is equal to this
        string; a value less than 0 if this string is lexicographically less
         than the string argument; and a value greater than 0 if this string
          is lexicographically greater than the string argument.
         */

        String strLiteral1 = "abc";
        String strLiteral2 = "abc";

        System.out.println(strLiteral1 +" "+strLiteral2);
        System.out.println(strLiteral1 == strLiteral2); //true
        strLiteral1 = "dbc";
        System.out.println(strLiteral1 +" "+strLiteral2);
        System.out.println(strLiteral1 == strLiteral2); //false

        //string to integer
        String s = "10";
        int ans = Integer.parseInt(s);
        System.out.println(ans);

        //integer to string
        int i = 10;
        String st = Integer.toString(i);
        System.out.println(st);

    }
}
