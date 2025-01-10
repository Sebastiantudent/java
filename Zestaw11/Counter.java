import java.util.ArrayList;
import java.util.List;

public class Counter<T>{
    List<T> lista = new ArrayList<T>();

    public void add(T item){
        lista.add(item);
    }
    public int getCount(){
        return lista.size();
    }
}
