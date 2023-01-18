package sem_exercises.ex_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Standard scanner from console (terminal) same as scanf() - C /input() - python
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: "); // print on the same line
        String name = scanner.nextLine(); // read string till ENTER
        System.out.print("Enter fac number: ");
        String fNum = scanner.next(); // read string till " "
        System.out.print("Enter age: ");
        int age = scanner.nextInt(); // read integer
        System.out.printf("My name is %s with fac number: %s. Age %d\n", name, fNum, age); // print with format specifiers like C printf()
        System.out.println("My name is " + name + " with fac number: " + fNum); // print new line at rhe end
        // TERMS: String concatenation -> "My name is" + name => "My name is {value of name}"
    }
}
