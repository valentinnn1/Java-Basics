package sem_exercises.ex_4;

public class Laptop extends Computer implements Movable {

    public Laptop(double size, String[] peripheral, String brand, boolean canPlayGames) {
        super(size, peripheral, brand, canPlayGames);
    }

    @Override
    public void interact() {
        System.out.println("do something");
    }

    @Override
    public void move() {
        System.out.println("moved");
    }

}
