import java.util.ArrayList;
import java.util.Collections;


public class Zestaw3 {

    public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        ArrayList<Integer> tab3 = new ArrayList<>();
        for (int i=0;i<tab1.size();i++)
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
        for (int i=0; i < tab1.size()+tab2.size();i++)
        {
            if(i<tab1.size() && i<tab2.size()) {
                tab3.add(tab1.get(i));
                tab3.add(tab2.get(i));

            }
            if(i>=tab1.size() && i<tab2.size()) {
                tab3.add(tab2.get(i));
            }
            if(i>=tab2.size() && i<tab1.size()) {
                tab3.add(tab1.get(i));

            }
            if(i>tab1.size() && i>tab2.size())
            {
                break;
            }
        }
        return tab3;
    }
    public static ArrayList<Integer> mergesorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> tab_pom1 = new ArrayList<>();
        ArrayList<Integer> tab_pom2 = new ArrayList<>();
        ArrayList<Integer> tab3 = new ArrayList<>();
        Collections.sort(tab1);
        Collections.sort(tab2);
        int k;
        if( tab1.size()>=tab2.size())
        {
            k= tab1.size();
            tab_pom1 = tab1;
            tab_pom2 = tab2;

        }
        else {
            k=tab2.size();
            tab_pom1 = tab2;
            tab_pom2 = tab1;
        }
        for (int j : tab_pom2) {
            tab_pom1.add(j);
        }
        System.out.println(tab_pom1);
        for(int i = 0; i < tab_pom1.size();i++){
            for(int j = i+1;j < tab_pom1.size();j++){
                if(tab_pom1.get(i) < tab_pom1.get(j)){
                    if(j==tab_pom1.size()-1){
                        tab3.add(tab_pom1.get(i));
                    }
                }
                else {
                    tab3.add(tab_pom1.get(j));
                    tab_pom1.set(j,tab_pom1.get(i));
                    break;
                }
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
    public static void main(String[] args){
        ArrayList<Integer> liczby = new ArrayList<Integer>();
        ArrayList<Integer> liczby1 = new ArrayList<Integer>();
        liczby.add(5);
        liczby.add(7);
        liczby.add(10);
        liczby.add(3);
        liczby.add(12);
        liczby.add(6);


        liczby1.add(4);
        liczby1.add(71);
        liczby1.add(102);
        liczby1.add(44);
        liczby1.add(2);
        liczby1.add(1);
        liczby1.add(12);
        liczby1.add(8);
        liczby1.add(10);
        System.out.println(mergesorted(liczby,liczby1));
        //Zestaw3.append(liczby,liczby1);
    }
}
