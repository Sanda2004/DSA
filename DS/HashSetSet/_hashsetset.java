
package dsa;

import java.util.HashSet;

/**
 *
 * @author Sandali
 */
public class _HashSet {
 
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); 

        System.out.println("HashSet: " + fruits);

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        System.out.println("Contains Mango? " + fruits.contains("Mango"));
    }
}

