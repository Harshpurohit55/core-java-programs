import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(6);

        System.out.println("Original ArrayList: " + numbers);

        
        int elementToRemove = 3;
        if (numbers.contains(elementToRemove)) {
            numbers.remove(Integer.valueOf(elementToRemove));
            System.out.println("After removing " + elementToRemove + ": " + numbers);
        } else {
            System.out.println(elementToRemove + " not found in the ArrayList.");
        }

        
        Collections.sort(numbers);
        System.out.println("After sorting in ascending order: " + numbers);

        
        int indexToAdd = 2;
        int elementToAdd = 10;
        numbers.add(indexToAdd, elementToAdd);
        System.out.println("After adding " + elementToAdd + " at index " + indexToAdd + ": " + numbers);
    }
}
