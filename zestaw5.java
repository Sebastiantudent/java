import java.util.ArrayList;
import java.util.Collections;
import java.util.SplittableRandom;

public class zestaw5 {
    public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        ArrayList<Integer> tab3 = new ArrayList<>();
        for (int i=0;i<tab1.size()-1;i++)
        {
            tab3.add(tab1.get(i));
        }
        for (int i=0;i<tab2.size();i++)
        {
            tab3.add(tab2.get(i));
        }
        return tab3;
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
    ArrayList<Integer> tab3 = new ArrayList<>();
    for (int i=0; i < tab1.size()+tab2.size()-2;i++)
    {
        if(i<tab1.size()-1 && i<tab2.size()-1) {
            tab3.add(tab1.get(i));
            tab3.add(tab2.get(i));

        }
        if(i>tab1.size()-1 && i<tab2.size()-1) {
        tab3.add(tab2.get(i));
        }
        if(i>tab2.size()-1 && i<tab1.size()-1) {
            tab3.add(tab1.get(i));
        }
        if(i>tab1.size()-1 && i>tab2.size()-1)
        {
            break;
        }
    }
    return tab3;
    }
    public static ArrayList<Integer> mergesorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2)
    {
        ArrayList<Integer> tab3 = new ArrayList<>();
        Collections.sort(tab1);
        Collections.sort(tab2);
        for(int i : tab1)
            for (int j : tab2)
            {
                if(i>=j){
                    tab3.add(j);
                }
                else
                {
                    tab3.add(i);
                }
            }
        return tab3;
    }
    public static ArrayList<String> toArrayList(String str){
        ArrayList<String> tab1 = new ArrayList<>();
        String [] strings = str.split("");

        return tab1;
    }
    public static ArrayList<ArrayList<Integer>> UniqueArrayList(ArrayList<Integer> tab1){
        ArrayList<ArrayList<Integer>> tab3 = new ArrayList<>();
        ArrayList<Integer> tab2 = new ArrayList<>();
        int h=0;
        for(int i : tab1) {
                tab2.add(i);
                tab2.add(0);
                tab3.add(tab2);
                tab2.removeAll(tab2);
        }
        for(ArrayList<Integer> j : tab3){
            h=0;
            for(ArrayList<Integer> t : tab3) {
                if (j == t) {
                    tab3.remove(h);
                }
                h++;
            }
        }
    return tab3;
    }
    public static void sprawdzenie(String[] args){

    }
}
