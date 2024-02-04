package L13_Strings_StringBuilder.Class;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abc");
        StringBuilder str1 = new StringBuilder("abc");
        System.out.println(str == str1); //false
        System.out.println(str.equals(str1));
        str.setCharAt(0,'d');

        char[] chArr = new char[100];
        chArr[0] = 'S';
    }
}
