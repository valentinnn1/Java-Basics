package lectures.lec2.calculate_credit_percent;

public class Money {
    // private field type float
    private float money;
    // constructor Money with parameter float money -> set value of money to field money
    public Money(float money){
        this.money = money;
    }

    // public methods that do the things for object of class Money
    public void calcCreditPercent(float creditPercent) {
        this.money += (this.money*creditPercent);
    }

    public void printMoney() {
        System.out.println("Your money: " + money);
    }
}
