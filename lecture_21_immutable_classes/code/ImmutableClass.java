package code;

public class ImmutableClass {

    public static void main(String[] args) {
        College col = new College("VIT", "Mumbai");
        Student s1 = new Student(22,"Suyash",col);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getCollege());

        System.out.println(col.name);
        System.out.println(col.address);

        System.out.println(s1.getCollege().name);
        System.out.println(s1.getCollege().address);

        s1.getCollege().name = "IIT B";
         System.out.println(s1.getCollege().name);

    }
}
// Immutable ?, hey this is not purely immutable , okay ??
final class Student{
    private final int age;
    private final String name;
    private final College college ;
    Student(int age,String name,College college){
        this.age = age;
        this.name = name;
        this.college = college;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public College getCollege(){
        return this.college;
    }
}
// cannot inherit from final Student

// class CSEStudent extends Student{

// }


// Mutable 
class College{
    String name;
    String address;

    College(String name, String address){
        this.name=name;
        this.address = address;
    }
}