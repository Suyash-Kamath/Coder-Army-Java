public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("Suyash",23,44);
        Student s2 = new Student("Krishna", 16, 108);

        // Student.college="VIT"; // No need of this line as I have made static block
        System.out.println(s1.name+" , "+s1.age+" , "+s1.rollNumber+" , "+Student.college);
        System.out.println(s2.name+" , "+s2.age+" , "+s2.rollNumber+" , "+Student.college);
      
}
}
class Student{
    String name;
    int age;
    int rollNumber;
    static String college;
    static int grade;
    Student(String name,int age, int rollNumber){
        this.name=name;
        this.age=age;
        this.rollNumber=rollNumber;
        
    }

    // static block

    static{
        college="VITM";
        grade=8;

    }
}
