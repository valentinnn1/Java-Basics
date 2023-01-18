package lectures.lec2.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    private int[] array;
    private int sum;

    // default constructor
    public MyArray() {
    }
    // constructor with parameters
    public MyArray(int[] array) {
        //this -> keyword points to field array
        this.array = array;
    }

    public void initElements() {
        System.out.println("Enter elements: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public void initWithRandomElements(int from, int to) {
        Random random = new Random();
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = random.nextInt(from, to);
        }
    }

    // get method
    public int[] getArray() {
        return this.array;
    }

    // set method
    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSum() {
        // foreach loop to iterate throw this.array
        for (int element : this.array) {
            sum += element;
        }
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    // override method toString to print this.array easier
    @Override
    public String toString() {
        return "array=" + Arrays.toString(this.array);
    }

}
