package lectures.lec2.arrays;

public class MainArray {
    public static final int MAX_LEN = 10;
    public static void main(String[] args) {
        // create obj from class MyArray with 10 elements
        MyArray myArray = new MyArray(new int[MAX_LEN]);
        /* alternative:
            MyArray myArray = new MyArray();    using default constructor
            myArray.setArray(new int[MAX_LEN]); using set method
        */

        // System.out.println(myArray); = System.out.println(myArray.toString());
        System.out.println("With default values: " + myArray); // string concatenation
        myArray.initWithRandomElements(50,100); // call method initWithRandomElements() for myArray obj
        System.out.println("With random elements: " + myArray);
        System.out.println("Sum of all elements is: " + myArray.getSum());
        myArray.setSum(0);

        // same but input from keyboard
        myArray.initElements();
        System.out.println(myArray);
        System.out.println("Sum of all elements is: " + myArray.getSum());

    }
}
