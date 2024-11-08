import java.lang.Math;
public class Main {
    public static int[] ciagArytmetycznyRodzajuM(int n, int m, int a1, int[] r){
        int[] tab = new int[n];
        int j=1;
        tab[0]=a1;
        for(int i = 0; i < m; i++) {
            if (i == 0) {
               // tab[i]=a1;
            }

            //tab[i] +=Math.pow((n - 1), j) * Math.pow(r[i], j);
            j++;
        }

        return tab;
        //an = a1+(n-1)*r+(n-1)2 * r2...
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
    /*
    public static boolean czyciagArytmetycznyRodzajuM(int[] tab,int m){
        int roznica = m-1;
        int[] tab2 = new int[tab.length-roznica];
        for(int i = 0; i<tab.length; i++){


            }


    }
    */
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
        for(int i = 0; i<n; i++){
            if(k % 2==0) {
                k = k /2;
                System.out.print(k + " ");
            }
            else if(k % 2 != 0) {
                k = k*3-1;
                System.out.print(k + " ");
            }
        }
    }
    public static void minmaxsekwencjaCollatza(int n,int c){
        int k = c;
        int m = 0;
        int min = c;
        int max = c;
        if(k % 2==0){
            m = k/2;
            min = m;
            max = m;
        }
        else {
            m = k*3-1;
            min = m;
            max = m;
        }

        for(int i = 0; i<n; i++){
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
                k = k*3-1;
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
    public static void main(String[] args) {

        //wypiszTablice(ciagArytmetycznyRodzajuM(3,3,1,new int[]{1,2,3}),3);
        System.out.println();
        int [] tab = {10,20,30,40,50};
        System.out.println(czyciagArytmetyczny(tab));
        System.out.println(podciag(tab));
        sekwencjaCollatza(6,5);
        System.out.println();
        minmaxsekwencjaCollatza(1,5);
        System.out.println(podciag(tab,10));

    }
}