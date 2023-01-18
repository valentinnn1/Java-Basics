package lectures;

import java.util.Scanner;

// C style
public class CalcCreditPercent {
    //constant in java
    private static final float CREDIT_PERCENT = 0.02f;
    public static void main(String[] args) {
        //method printMoney take as value int that is returned by inputMoney()
        printMoney(inputMoney());
    }

    private static void printMoney(int money) {
        System.out.println("Your money after credit calculation: " + calcCreditPercent(money));
    }

    private static float calcCreditPercent(int money) {
        return money + (money*CREDIT_PERCENT);
    }

    public static int inputMoney(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter debit: ");
        return scanner.nextInt();
    }
}
