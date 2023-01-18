package sem_exercises.ex_4;

public class Desktop extends Computer{
    public Desktop(double size, String[] peripheral, String brand, boolean canPlayGames) {
        super(size, peripheral, brand, canPlayGames);
    }

    @Override
    public void interact() {
        System.out.println("do something");
    }
}
