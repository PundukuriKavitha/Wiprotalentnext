//Given an ArrayList containing n names, use StringJoiner to construct a new sequence of names separated by, (comma) and enclosed in { } brackets.

//forEach, add
package strings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class Question8 {
    public static void main(String[] args) {
        // Step 1: Create the ArrayList with names
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David"));

        // Step 2: Create a StringJoiner with comma as delimiter, and {} as prefix/suffix
        StringJoiner joiner = new StringJoiner(",", "{", "}");

        // Step 3: Use forEach to add each name to the StringJoiner
        names.forEach(joiner::add);

        // Step 4: Print the result
        System.out.println("Joined names: " + joiner.toString());
    }
}
