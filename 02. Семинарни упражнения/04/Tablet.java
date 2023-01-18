package sem_exercises.ex_4;

public class Tablet extends Computer implements Movable{
    public Tablet(double size, String[] peripheral, String brand, boolean canPlayGames) {
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
