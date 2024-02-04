package L15_Intro_To_OOPs.Practice;
import java.util.Scanner;

public class Codechef_OPJA03_CodingProblem {
    //https://www.codechef.com/learn/course/college-oops-java/CPOPJA01/problems/OPJA03
    public static void main(String[] args) {
        Student s = new Student();
        Scanner scanner = new Scanner(System.in);

        s.name = scanner.next();
        s.age = scanner.nextInt();

        s.display();

        scanner.close();
    }
}



class Student {
    public String name;
    public int age;

    public void display() {
        System.out.println(name + " " + age);
    }
}

