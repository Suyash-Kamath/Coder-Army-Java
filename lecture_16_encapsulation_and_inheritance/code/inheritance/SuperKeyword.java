package code.inheritance;

public class SuperKeyword {
    public static void main(String[] args) {
        // EngineeringStudent es1 = new EngineeringStudent();
        // es1.name="Suyash";
        // es1.age=22;
        // es1.rollNumber=44;
        // es1.college="VIT";
        // es1.print();

        EngineeringStudent es2 = new EngineeringStudent("Suyash",22,44,"VIT");

        es2.print();
    }
}


class Student{
    String name ;
    int age;
    int rollNumber;
    Student(){

    }
        Student(String name, int age, int rollNumber){
            this.name=name;
            this.age=age;
            this.rollNumber=rollNumber;
        }

     void print(){
        System.out.println(name + " , "+ age + " , "+ rollNumber);

    }

}


class EngineeringStudent extends Student{
    String college;
    int x;
    EngineeringStudent(String name, int age, int rollNumber , String college){
        super(name, age, rollNumber);
        this.college=college;
    }
    void print(){
        // System.out.println(super.name + " , "+ super.age + " , "+ super.rollNumber+ " , "+ super.x);
        super.print();
        System.out.println(college);

    }
}