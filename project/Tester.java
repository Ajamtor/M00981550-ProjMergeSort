import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
    public static boolean testSort() {
        ArrayList<String> months = new ArrayList<>(Arrays.asList(
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        ));
        
        ArrayList<String> expected = new ArrayList<>(Arrays.asList(
            "April", "August", "December", "February", "January",
            "July", "June", "March", "May", "November", "October", "September"
        ));
        
        Sorter sorter = new Sorter();
        ArrayList<String> result = sorter.mergeSort(months);
        
        return result.equals(expected);
    }
}

// The important part of this code lies in the boolean nature of it.
// "public class Tester" clarifies a public class named "Tester"
// which contains the testing code, and "public static boolean testSort" clarifies
// a public static method named "testSort" that returns a true or false result.
// Two arrays are given, one which incldues unsorted months named "months" and one
// which includes alphabetically sorted months named "expected".
// "Arrays.asList" creates a fixed size list backed by an array.
// "new ArrayList" creates a new array list containing the elements from that list.
// "Sorter sorter = new Sorter" creates a new instance of the "Sorter" class.
// "ArrayList<String> result = sorter.mergeSort(months)" calls the "mergeSort"
// method on the months list which is meant to arrange the months alphabetically,
// and stores the result. "result.equals(expected)" uses ".equals" code in java which 
// compares two lists and if they contain the same elements in the same order,
// it returns true. The lists it compares include the expected list and the sorted one.
// This method is then called on within the "main" file and the code there runs accordingly.