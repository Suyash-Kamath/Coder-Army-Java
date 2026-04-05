/*
Inheritance -> Supports polymorphism and code resuability
*/


public class Inheritance {

    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.markAttendance();
        es.attendLab();

        Student s1=new Student();
        s1.markAttendance();
        // s1.attendLab(); // (wrong)
    }

}

/*

parent (Superclass) --> child (subclass)

*/
class Student{
    String name;
    int age;

    protected void markAttendance(){
        System.out.println("Attendance Marked");
    }
}

class EngineeringStudent extends Student{
    void attendLab(){
        System.out.println("Lab Attended");
    }
}


