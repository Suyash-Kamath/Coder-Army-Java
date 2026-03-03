

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name="Suyash";
        s1.age=22;
        s1.rollNumber=44;
        s1.college="VIT";


        s2.name="Krishna";
        s2.age=22;
        s2.rollNumber=108;
        s2.college="VIT";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();



    }
}


class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance(){
        System.out.println("Attendance marked by "+name);
    }

    void print(){
        System.out.println(name+" "+age+" "+rollNumber+" "+college);
    }
}