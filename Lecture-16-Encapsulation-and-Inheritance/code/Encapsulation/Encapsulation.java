// Encapsulation says kisi bhi data ko private karo and uska access dedo methods ke through
// Encapsulatioon says agar aapko unrestricted access hatani hai toh kisi bhi field ke aage private lagaa do and uske methods hai jiske through use access kiya jaa sakta hai unko public banaa do 
// Hame user ko balance ko access karne se nahi rokna tha , hame directly usko access karne se rokna tha 
// This is the funda of Encapsulation

public class Encapsulation {
    public static void main(String []args){

        BankAccount ba = new BankAccount();
        // ba.balance = 1000000;        // COMPILE ERROR — private!
        ba.deposit(500);              // Works — controlled!
        ba.withdraw(300);             // Works — with validation!
        System.out.println(ba.getAmount()); // 200.0
      
    }
}


class BankAccount{

    private double balance;

    public void deposit(double amount){
      if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);

    }

      public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public double getAmount(){
        return balance;
    }


}

class Student{
  private   String name;
  private   int rollNumber;
  private   int age;
  private   String college;

  Student(String name, int rollNumber,int age , String college){
    this.name =name;
    this.age=age;
    this.rollNumber=rollNumber;
    this.college=college ;


  }

  public String getName(){
    return  name;
  }

  public void setName(String name){
    this.name = name ;
  }

  public String getCollege(){
    return college;
  }

  public void setCollege(String college){
    // Validation -> College should be real
    this.college = college;
  }
}