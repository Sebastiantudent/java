import java.util.*;

public class Main {

    public static <T> void printUnique(Collection<T> items) {
        Set<T> uniqueElements = new HashSet<>(items);

        for (T item : uniqueElements) {
            System.out.println(item + " ");
        }
    }
    public static <T> int countOccurrences(Collection<T> items,T element) {
        int count = 0;
        for (T item : items) {
            if (item.equals(element)) {
                count++;
            }
        }
        return count;
    }
    public static <T>ArrayList<T> mergeLists(ArrayList <T> items1, ArrayList<T> Items2) {
        ArrayList<T> mergedItems = new ArrayList<>();
        mergedItems.addAll(items1);
        mergedItems.addAll(Items2);
        return mergedItems;
    }
    public static <T> int countElements(Iterable<T> items, T element){
        int count = 0;
        for (T item : items) {
            if (item.equals(element)) {
                count++;
            }
        }
        return count;
    }
    public static <T> boolean isPalindrome(LinkedList <T> items) {
        LinkedList <T> temp = items.reversed();
        if(temp.equals(items)){
            return true;
        }
        else
            return false;
    }
    public static <T> HashSet<T> findUnique(List <T> items) {
    HashSet <T> uniqueItems = new HashSet<>();
    for (T item : items) {
        uniqueItems.add(item);
    }
    return uniqueItems;
    }
    //F1
    public static <T> TreeSet<T> findElementsinRange(TreeSet<T> items, T lowerBound, T upperBound) {
        TreeSet<T> mergedItems = (TreeSet<T>) items.subSet(lowerBound,true,upperBound,true);
        return mergedItems;
    }
    public static <T,V> HashMap<V,T> swapKeysAndValues(HashMap<T,V> map) {
        HashMap<V,T> countOccurrences = new HashMap<>();
        for (T item : map.keySet()) {
        countOccurrences.put(map.get(item), item);
        }
        return countOccurrences;
    }
    public static <T,V> TreeMap<T,V> subMap(TreeMap<T,V> map, T lower, T upper) {
        TreeMap<T,V> sortedMap = (TreeMap<T,V>) map.subMap(lower, upper);
        //sortedMap.subMap(lower, true, upper, true);
        return sortedMap;
    }

    public static void main(String[] args) {
    TreeSet <Integer> items = new TreeSet<>();
    items.add(1);
    items.add(2);
    items.add(3);
    items.add(4);
    items.add(5);
    items.add(6);
    items.add(7);
    System.out.println(findElementsinRange(items,1,3));
    LinkedList <Integer> items1 = new LinkedList <>();
    items1.add(1);
    items1.add(2);
    items1.add(3);
    items1.add(4);
    items1.add(3);
    items1.add(2);
    items1.add(1);
    items1.add(5);
    System.out.println(isPalindrome(items1));



    }
}