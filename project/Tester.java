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