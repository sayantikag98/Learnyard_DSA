package L15_Intro_To_OOPs.Class;

public class ClassDemo {
    public static void main(String[] args) {
        Person p = new Person("Say", 20);
        System.out.println(p);
    }
}

class Person{
    private String name;
    private int age;

    Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }

    int getAge(){
        return this.age;
    }

    void setAge(int age){
        if(age<0){
            System.out.println("Please enter a valid age");
            return;
        }
        this.age = age;
    }
}
