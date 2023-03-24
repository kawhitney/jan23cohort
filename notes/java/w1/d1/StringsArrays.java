package notes.java.w1.d1;

import java.util.ArrayList; // needed for dynamic arrays (ArrayList)

public class StringsArrays {
    public static void main(String[] args){
        // === STRINGS ===
        String lucy = "Poor Lucy got hurt again.";
        System.out.println(lucy.length());

        // concat
        String str1 = "My name is ";
        String str2 = "Katie";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        // index of
        String ninja = "Welcome to Coding Dojo!";
        int a = ninja.indexOf("Coding"); // a is 11
        int b = ninja.indexOf("ninja"); // c is -1, "ninja" is not found
        System.out.println(a);

        // compare
        String x1 = "hello";
        String x2 = "hello";
        System.out.println(x1 == x2); // TRUE
        System.out.println(x1.equals(x2)); // TRUE: same exact characters

        String y1 = new String("hello");
        String y2 = new String("hello");
        System.out.println(y1 == y2); // FALSE: not the same object in memory
        System.out.println(y1.equals(y2)); // TRUE: same exact characters

        // === ARRAYS ===
        // static
        int[] numbers;
        numbers = new int[5]; // fixed sized array
        numbers[0] = 1; // set values in array
        // string - static
        String[] fruits = {"banana", "pear", "papaya", "kiwi", "grapes", "apple", "kumquat"};
        // System.out.println("=".repeat(30));
        // System.out.println(fruits[0]);
        // swap(fruits, 0, 3); // automatically passes by reference!! 
        // System.out.println(fruits[0]);
        // System.out.println("=".repeat(30));
        // print the string
        for(String name : fruits){
            System.out.println("hello " + name);
        }

        // dynamic
        // ArrayList<Object> things = new ArrayList<Object>();
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(3);
        myArray.add(7);
        myArray.add(5);
        myArray.add(13);
        for(Integer value : myArray){
            System.out.println(value);
        }

        
    }
    public static void swap(String[] arr, int i1, int i2){
        String temp = arr[i1]; // assigns temp to "banana"
        arr[i1] = arr[i2]; // { "kiwi", "pear", "papaya", "kiwi"}
        arr[i2] = temp; // { "kiwi", "pear", "papaya", "banana"}
    }
}
