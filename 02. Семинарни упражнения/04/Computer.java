package sem_exercises.ex_4;

public abstract class Computer implements Presentable, Computable, Intractable{
    private double size;
    private String[] peripheral;
    private String brand;
    private boolean canPlayGames;

    public Computer(double size, String[] peripheral, String brand, boolean canPlayGames) {
        this.size = size;
        this.peripheral = peripheral;
        this.brand = brand;
        this.canPlayGames = canPlayGames;
    }

    @Override
    public void present(String dataToPresent) {
        System.out.println("Presenting: " + dataToPresent);
    }

    @Override
    public double compute(String operator, double n1, double n2) {
        switch (operator){
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return  n1 * n2;
            case "/":
                if (n2 != 0){
                    return n1 / n2;
                }else {
                    System.out.println("can not divide by zero");
                    return 0;
                }
            default:
                System.out.println("unknown operator");
                return 0;
        }
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String[] getPeripheral() {
        return peripheral;
    }

    public void setPeripheral(String[] peripheral) {
        this.peripheral = peripheral;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isCanPlayGames() {
        return canPlayGames;
    }

    public void setCanPlayGames(boolean canPlayGames) {
        this.canPlayGames = canPlayGames;
    }
}
