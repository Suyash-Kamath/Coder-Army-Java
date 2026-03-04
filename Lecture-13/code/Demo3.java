

public class Demo3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
    }
}


class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    Student(){
        this("Unknown");
        System.out.println("I am the first constructor");
    }
    Student(String name){
        this(name,0);
        System.out.println("I am the second constructor");
    }

    Student(String name,int age){
        this(name,age,0);
        System.out.println("I am the third constructor");
    }

    Student(String name,int age, int rollNumber){
        this(name,age,rollNumber,"Unknown");
        System.out.println("I am the fourth constructor");
    }

    Student(String name, int age, int rollNumber,String college){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
        System.out.println("I am the fifth constructor");
    }
}
