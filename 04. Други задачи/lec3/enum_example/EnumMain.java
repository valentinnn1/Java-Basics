package lectures.lec3.enum_example;

import java.util.Scanner;

public class EnumMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // infinite loop
        while (true) {
            try {
                // scanner takes string form terminal -> cast to Day enum, if cast is successful (this enum exist)
                // print it, else catch the exception and throw a message
                Day dayInput = Day.valueOf(scanner.next().toUpperCase());
                System.out.println(dayInput);
            } catch (Exception e){
                System.out.println("No enum constant found");
                break;
            }
        }
    }
}
