package sem_exercises.ex_2;

public class Main {
    public static void main(String[] args) {
        printSemiPyramid(5);
    }

    public static void printSemiPyramid(int a){
        String star = "*";
        for(int i = 0; i < a; i++){
            System.out.println(repeat(" ",a-i-1) + repeat(star, 2*i + 1));
        }
    }

    private static String repeat(String s, int count){
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < count; i++) {
            buffer.append(s);
        }
        return buffer.toString();
    }

}
