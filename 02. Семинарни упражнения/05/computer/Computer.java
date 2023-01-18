package sem_exercises.ex_5.computer;

import java.io.Externalizable;
import java.io.Serializable;
import java.util.Arrays;

public class Computer implements Serializable {
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
    public String toString() {
        return "Computer{" +
                "size=" + size +
                ", peripheral=" + Arrays.toString(peripheral) +
                ", brand='" + brand + '\'' +
                ", canPlayGames=" + canPlayGames +
                '}';
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
