import java.lang.Math;
public class Main {
    public static int[] ciagArytmetycznyRodzajuM(int n, int m, int a1, int[] r){
        int[] tab = new int[n];
        tab[0] = a1;
        for(int i = 1; i < n; i++){
            int suma=a1;
            for(int j = 0; j < m; j++){
                suma+=Math.pow(i,j+1)*r[j];

            }
            tab[i] = suma;
        }
        return tab;
    }
    public static void wypiszTablice(int[] tab,int n) {


        for (int i = 0; i < n; i++) {

                System.out.print(tab[i] + " ");


        }

    }
    public static boolean czyciagArytmetyczny(int[] tab){
        int roznica = tab[1]-tab[0];
        for(int i = 1; i<tab.length; i++){
           if(tab[i]-tab[i-1] != roznica){
               return false;
           }

        }

        return true;
    }

    public static boolean czyciagArytmetycznyRodzajuM(int[] tab,int m){
        for(int i = 0; i < m-1; i++){
            for(int j = 0; j < tab.length-1-i; j++){
                tab[j]=tab[j+1]-tab[j];
            }

        }
        int [] wynik= new int[tab.length-(m-1)];
        for(int i = 0; i < wynik.length; i++){
            wynik[i]=tab[i];
        }
    return czyciagArytmetyczny(wynik);
    }

    public static int podciag(int[] tab,int r){
        int k = 1;
        int m = k;
        for(int i = 0; i<tab.length-1; i++){
            if(tab[i+1] == tab[i]+r){
                k++;

            }
            else {
                if(m<k){
                    m=k;

                }
                k=1;
            }
        }
        if(m>k){
            return m;
        }
        else {
            return k;
        }

    }
    public static int podciag(int[] tab){
        int k = 1;
        int m = k;
        for(int i = 0; i<tab.length-1; i++){
            if(tab[i] < tab[i+1]){
                k++;

            }
            else {
                if(m<k){
                m=k;

                }
                k=1;
            }
        }
        if(m>k){
            return m;
        }
        else {
            return k;
        }

    }
    public static void sekwencjaCollatza(int n,int c){
        int k = c;
        String Wynik = ""+c;
        for(int i = 0; i<n-1; i++){
            if(k % 2==0) {
                k = k /2;
                Wynik += " "+k;
            }
            else if(k % 2 != 0) {
                k = k*3+1;
                Wynik += " "+k;
            }
        }
        System.out.println(Wynik);
    }
    public static void minmaxsekwencjaCollatza(int n,int c){
        int k = c;
        int m = 0;
        int min = c;
        int max = c;


        for(int i = 0; i<n-1; i++){
            if(k % 2==0) {
                k = k / 2;
                if(max < k ){
                    max = k;
                }
                else if(min > k){
                    min = k;
                }

            }
            else if(k % 2 != 0) {
                k = k*3+1;
                if(max < k){
                    max = k;
                }
                else if(min > k){
                    min = k;
                }

            }
        }

        System.out.println("min="+min);
        System.out.println("max="+max);
    }
    public static boolean zad1_2(double x, double y, int k){
        return Math.abs(x-y)<=Math.pow(10,-k);
    }
    public static int zad2_2(int S){
        int i = 0;
        while (!(Math.pow(i,2)<S && Math.pow(i+1,2)>S)) {
            i++;
        }
        return i;
    }

    public static double zad3_2(int S, int n, int k){
        double x = zad2_2(S);
        double x_next = ((n-1)*x+(S/Math.pow(x,n-1)))/n;
        while (zad1_2(x_next,x,k)){
        x = x_next;
        x_next = ((n-1)*x+(S/Math.pow(x,n-1)))/n;
        }
        return x_next;
    }

    public static void main(String[] args) {


        System.out.println("=========================================");
        int tab1[] = ciagArytmetycznyRodzajuM(10,1,3,new int[]{2});
        for (int i = 0; i < tab1.length; i++) {

            System.out.print(tab1[i] + " ");

        }
        System.out.println();
        int [] tab = {1,2,0,3,5,1,4};
        System.out.println(czyciagArytmetyczny(tab));
        System.out.println(podciag(tab));


        sekwencjaCollatza(10,6);
        System.out.println();
        minmaxsekwencjaCollatza(10,6);
        System.out.println(podciag(tab,10));

    }
}