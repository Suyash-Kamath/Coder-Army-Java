/*

Simple Inheritance
Multi-level inheritance
hierarchial inheritance
multiple inheritance (not supported by java through class but supported by interfaces)

*/
package code.inheritance;

public class TypesOfInheritance {



}


// Parent Class
class Student{

    String name;
    int age;

    public void markAttendance(){
        System.out.println("Attendance Marked");
    }

}

// Child class
class EngineeringStudent extends Student {
    void attendLab(){
        System.out.println("Lab Attended for engineering student");
    }
}


// Multilevel: A -> B -> C

class CSEEngineeringStudent extends EngineeringStudent{
    void attendCSELab(){

    }
}


/* 

Hierarchial

        A
       /  \
      B    C 
*/


class MedicalStudent extends Student {
    void attendLab(){
        System.out.println("Attended Lab for medical Student ");
    }

}

/*

Multiple Inheritance 

A   B
  \/
  C

*/

