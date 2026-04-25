// POJO means Plain Old Java Object
/*
It’s basically just a simple Java class that doesn’t depend on any special frameworks, rules, or complex inheritance. No magic—just clean, normal Java.
A POJO typically:

Has private fields (variables)
Provides getters and setters
May have constructors
Doesn’t extend or implement heavy framework-specific classes (like EJB, etc.)
No special annotations required (though modern POJOs can have them)

Keeps your code simple and readable
Easy to test and maintain
Used heavily in:
Spring Boot (for models / DTOs)
Hibernate / JPA (for entities)
APIs (request/response objects)


Real World Analogy:
A simple data container — like a box holding values (name, age, etc.) without any extra logic or complexity.


Lets say you want to represent Student , so aapko POJO hi banani padegi naa 
Student ko programming me Model karna , so this is also called model class , and this is used in Databases mostly


See , Pojo is subjective term , aisa nahi ki yeh perfect / imperfect POJO hai 

Jab POJO bana tha toh generally aisa kehna tha ki , True pojo wo hogi jisme hard code business logic naa hogi 
they can have getter/setter , constructor , variable defines , jise field kehte 

again the definiation is veyr subjective , kuch log usme Builder bhi daalte hai , thoda business logic 


First purpose of Pojo was No business logic , baadme people said ki POJO matlab hai ki framework use nahi kare,  tih business or builer daalne me kya dikkat hai 

toh wo exactly model nahi kar paa rahi 

Student jo bahar hai  and jo programming me hai , usko  class se represent kar rahe hai par hum uske behaviours ko bhi daal rahe hai 

but in POJO , behavioours ko naa batake sirf getter setters daaldo , ye bhi kar sakte that behaviours ke liye alag class 

POJO is divided into 2 parts , this is architectural camparison , asliyat me dono POJO hoti hai 

POJO -> anemic model (simple POJO) and rich domain model (business logic bhi ho sakta hai ), dono pojo hi hai , lekin thoda seperation kiya 
*/

package code;

public class POJO {
    public static void main(String[] args) {
        
    }
}

 class Student{
    private String name;
    private int age ;

   public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

     // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }

}


