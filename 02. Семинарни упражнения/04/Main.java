package sem_exercises.ex_4;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(16.7, new String[]{"mouse", "earphones"}, "Asus", true);
        Desktop desktop  = new Desktop(19.6, new String[]{"mouse", "keyboard, monitor"}, "Asus", true);
        Tablet tablet = new Tablet(9.1, new String[]{"mouse", "earphones"}, "Samsung", false);
        desktop.interact();
        tablet.move();
        System.out.println(laptop.compute("+", 12, 3));
        tablet.present("Home screen");
    }
}
