import java.util.ArrayList;

public class Sorter {
    public ArrayList<String> mergeSort(ArrayList<String> list) {
        if (list.size() <= 1) {
            return list;
        }