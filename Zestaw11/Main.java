import java.util.List;
class Tab<T>{
    T[] array;
   public void setArray(T[] array){
       this.array = array;
   }
}
public class Main {
    public static <T> boolean isEqual(T box1, T box2) {
        return box1.equals(box2);
    }
    public static <T extends Comparable<T>> T minValue(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być pusta");
        }

        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }
     public static <T> void swap(T[] tab,int first,int second){

        if(tab.length>first && tab.length>second && first>=0 && second>=0){
            var count = tab[first];
            tab[first]=tab[second];
            tab[second]=count;
        }
        else {
            throw new IndexOutOfBoundsException("Out of Index");
        }
    }
    public static <T extends Animal> T findMax(T elem1, T elem2) {
        return elem1.compareTo(elem2) > 0 ? elem1 : elem2;
    }
    public static <T> T findMax2(Pair<? extends Animal> pair1) {
        
    }
    
    public static void main(String[] args) {

       Box<String> box1 = new Box<>();
       box1.setObject("Object 1");

       Box<Integer> box2 = new Box<>();
       box2.setObject(2);

       System.out.println(isEqual(box1,box2));

       Counter<String> counter = new Counter<>();
       counter.add("Jablko");
       counter.add("truskawka");
       counter.add("melon");
        System.out.println(counter.getCount());


       Counter<Integer> counter2 = new Counter<>();
       counter2.add(1);
       counter2.add(2);
       counter2.add(3);
       System.out.println(counter2.getCount());

       Animal animal1 = new Animal();
       animal1.setAnimal(30);

       Animal animal2 = new Animal();
       animal2.setAnimal(10);




    }
}
