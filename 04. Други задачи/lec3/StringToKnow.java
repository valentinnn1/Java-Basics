package lectures.lec3;

import java.util.Arrays;

public class StringToKnow {
    public static void main(String[] args) {
        String string1 = new String("hello");
        String string2 = new String("hello");
        char[] chars = {'h','e','l','l','o'};

        System.out.println("1 Index of 'h': " + string1.indexOf('h'));
        System.out.println("2 Index of 'x': " + string1.indexOf('x'));

        System.out.println("3.1 Convert string to char array: " + string1.toCharArray());
        // printing string1.toCharArray() => address of the array, something like '[C@7b23ec81'
        // to get the actual date => Arrays.toString(...)
        System.out.println("3.2 Convert string to char array: " + Arrays.toString(string1.toCharArray()));

        System.out.println("4. Convert char array to string: " + new String(chars));
        System.out.println("5. Get length of string: " + string1.length());
        System.out.println("6. Find char at index: " + string1.charAt(0));
        System.out.println("7. To upper/lower case: " + string1.toUpperCase() /*string1.toLowerCase()*/);

        // string compare -> if variable is stored in heap, then operator '==' compares their addresses
        if(string1 == string2){
            System.out.println("8. String compare '==': Addresses are the same");
        }else {
            System.out.println("8. String compare '==': Addresses are different");
        }
        // spring compare by value of variable
        if(string1.equals(string2)){
            System.out.println("9. Spring compare by value: they are the same");
        }else {
            System.out.println("9. Spring compare by value: they are different");
        }
    }
}
