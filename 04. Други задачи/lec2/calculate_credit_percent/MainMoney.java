package lectures.lec2.calculate_credit_percent;

import java.util.Scanner;
// java style
public class MainMoney {
    public static void main(String[] args) {
        // init scanner to read from keyboard (terminal)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter money: ");
        // create object from class Money -- new Money() -> call constructor with value int (amount of money)
        Money money = new Money(scanner.nextInt());
        // call method printMoney for obj money...
        money.printMoney();
        money.calcCreditPercent(0.02f);
        money.printMoney();
    }
}
