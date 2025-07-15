//Given two StringJoiners s1 and s2 which contains n city names separated by output for the given cases: (hyphen), display the

//i) s1 merged to s2.

//ii) s2 merged to s1.
package strings;
import java.util.StringJoiner;

public class Question7{
    public static void main(String[] args) {
        // Create StringJoiners with hyphen as delimiter
        StringJoiner s1 = new StringJoiner("-");
        StringJoiner s2 = new StringJoiner("-");

        // Add cities to s1
        s1.add("Mumbai");
        s1.add("Pune");
        s1.add("Nagpur");

        // Add cities to s2
        s2.add("Delhi");
        s2.add("Chennai");
        s2.add("Kolkata");

       
        StringJoiner s1ToS2 = new StringJoiner("-");
        s1ToS2.merge(s2);

        StringJoiner temp1 = new StringJoiner("-");
        for (String city : s1.toString().split("-")) {
            temp1.add(city);
        }
        temp1.merge(s2);

        StringJoiner temp2 = new StringJoiner("-");
        for (String city : s2.toString().split("-")) {
            temp2.add(city);
        }
        temp2.merge(s1);

        // Output:
        System.out.println("i) s1 merged to s2: " + temp1.toString());
        System.out.println("ii) s2 merged to s1: " + temp2.toString());
    }
}
