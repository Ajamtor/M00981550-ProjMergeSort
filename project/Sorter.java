import java.util.ArrayList;

public class Sorter {
    public ArrayList<String> mergeSort(ArrayList<String> list) {
        if (list.size() <= 1) {
            return list;
        }
        
        int mid = list.size() / 2;
        ArrayList<String> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<String> right = new ArrayList<>(list.subList(mid, list.size()));
        
        left = mergeSort(left);
        right = mergeSort(right);
        
        return merge(left, right);
    }
    
    private ArrayList<String> merge(ArrayList<String> left, ArrayList<String> right) {
        ArrayList<String> result = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareToIgnoreCase(right.get(j)) <= 0) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }
        
        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }
        
        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }
        
        return result;
    }
}

// "public class Sorter" includes the main sorting algortihm. 
// "mergeSort" method is then used recursively, with the intial "if" statement clarifying
// if the list size is 1 or less, it just returns the list (the final step of reccursion).
// line 9 introduces "mid" which stores an integer representing half of the size of the list.
// Then the list is divided into 2, from elemnt 0 until midpoint, stored as "left"
// and from the midpoint until the last element, stored as "right".
// The "mergeSort" method is then called upon again for "left" and "right" lists again,
// which does the exact same, divide into 2, store, call on "mergeSort", repeat.
// This process goes on until the "if" statement at the start is satisfied.
// After both halves are sorted, "return merge(left, right)" merges them together
// and returns the result.
// We however need a new method to help with correct merging, this is line 19, name "merge".
// "private" because we only need to access it within the "Sorter" class, it returns 
// an "ArrayList" of strings, and the two parameters left and right are to be merged.
// Most important piece of code here is "compareToIgnoreCase" which compares the strings
// alphabetically, ignoring case differences. 
// Line 20 creates a new empty "ArrayList", "i=0, j=0" is to set initial conditions and
// keep track of position in the list.
// Line 23 creates a "while" loop to keep going as long as there are elements in the 
// "left" and "right" lists, followed by an "if" statement which compares the elemtns
// in those indexes alphabetically, and depending on which one comes first, adds that
// to the new list, and then it moves onto the next elements.
// The final two "while" loops checks to see if there are any elemnts left in the "left"
// or "right" list and if so, it adds it to the new list and returns "result" which
// was the name of the new list initially created. 
// "mergeSort" is called upon in the Tester file to run this sorting algorthm on the
// given list of months to sort alphabetically. 