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