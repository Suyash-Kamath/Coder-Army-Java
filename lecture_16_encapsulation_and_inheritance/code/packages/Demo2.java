package code.packages;
// import code.packages.college.Student;
// import code.packages.school.Student;
// it is like #include<iostream>

// import code.packages.college.* ; // college package ke andhar jitni classes thi unko import kiya
// import code.packages.college.*;
// import code.packages.school.*;
// I CAN DO THESE BOTHS , college.Students as well as for school jab object banani ho toh hi
public class Demo2 {
    

    public static void main(String[] args) {
        code.packages.college.Student s1 = new code.packages.college.Student();
        s1.print();

        code.packages.school.Student s2 = new code.packages.school.Student();
        s2.print();


    }

}
