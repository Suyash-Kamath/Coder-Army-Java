import java.util.Scanner;

public class UnderstandingScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Kitni bhi advance class banale , apne ko kaam andharse InputStream se hi toh karni padegi, kyuki keyboard se data read karna hai  and yei kaam exactly InputStream ka hai

        String name = sc.nextLine();
        System.out.println(name);
    }
}
