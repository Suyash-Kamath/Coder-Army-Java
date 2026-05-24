package code;

public class DefensiveCopy {

    public static void main(String[] args) {
        College col = new College("VIT", "Mumbai");
        Student s1 = new Student(22,"Suyash",col);


        

        System.out.println(s1.getCollege().name);
       

        s1.getCollege().name = "IIT B";
         System.out.println(s1.getCollege().name);

    }
}
// Immutable 
// defensive copy of college (non primitive)

final class Student{
    private final int age;
    private final String name;
    private final College college ;
    Student(int age,String name,College college){
        this.age = age;
        this.name = name;
        this.college = new College(college.name, college.address);
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public College getCollege(){
        return new College(this.college.name, this.college.address);
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