
import java.util.Random;
public class Zestaw4 {
    public static void generujTablice(int n, int minWartosc, int maxWartosc) {
        int [] tab = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            tab[i]=r.nextInt(maxWartosc - minWartosc + 1)+minWartosc;
        }
                    }
    public static void wypiszTablice(int[] tab,int n, int m) {
            /*
        if(n*m>tab.length) {
                int reszta = n*m-tab.length;
                for(int i : tab) {
                    System.out.print(i + " ");
                }
                for(int i=0;i<reszta;i++) {

                }

            }

             */

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print(tab[j + m * i] + " ");
                    }
                    System.out.println();
                }

    }
    public static void ileNieparzystych(int[] tab) {
        int suma = 0;
        for (int i : tab) {
            if (tab[i]%2!=0) {
                suma += 1;
            }
        }
        System.out.println(suma);
    }
    public static void ileParzystych(int[] tab) {
        int suma = 0;
        for (int i : tab) {
            if (tab[i]%2==0) {
                suma += 1;
            }
        }
        System.out.println(suma);
    }
    public static void ileDodatnich(int[] tab) {
        int suma = 0;
        for (int i : tab) {
            if (i>=0) {
                suma += 1;
            }
        }
        System.out.println(suma);
    }
    public static void ileUjemnych(int[] tab) {
        int suma = 0;
        for (int i : tab) {
            if (i<0) {
                suma += 1;
            }
        }
        System.out.println(suma);
    }
    public static void ileZerowych(int[] tab) {
        int suma = 0;
        for (int i : tab) {
            if (i==0) {
                suma += 1;
            }
        }
        System.out.println(suma);
    }
    public static void ileMaks(int[] tab) {
        int suma = tab[0];
        int Calsuma = 0;
        for (int i : tab) {
            if (i>suma) {
                suma = i;
            }
        }
        for (int i :tab){
            if (i==suma){
                Calsuma +=1;
            }
        }
        System.out.println(Calsuma);
    }
    public static void ileMin(int[] tab) {
        int suma = tab[0];
        int Calsuma1 = 0;
        for (int i : tab) {
            if (i<suma) {
                suma = i;
            }
        }
        for (int i :tab){
            if (i==suma){
                Calsuma1 +=1;
            }
        }
        System.out.println(Calsuma1);
    }
    public static void ileUnikalnych(int[] tab) {
        int suma = 0;
        int Calsuma = 0;
        for (int i : tab) {
            for (int j : tab) {
                if (i==j) {
                    suma += 1;
                    if (suma==1)
                    {
                        Calsuma += 1;
                }
            }
            }
            suma = 0;
        }
    System.out.println(Calsuma);
    }
    public static void SumaDodatnich(int[] tab) {
        int suma = 0;
        for (int i : tab) {
            if (i>=0) {
                suma += i;
            }
        }
        System.out.println(suma);
    }
    public static void SumaUjemnych(int[] tab) {
        int suma = 0;
        for (int i : tab) {
            if (i<0) {
                suma += i;
            }
        }
        System.out.println(suma);
    }
    public static void SumaOdwrotnosci(int[] tab) {
        int suma = 0;
        for (int i : tab) {
                suma += 1/i;
        }
        System.out.println(suma);
    }
    public static void SredniaArytmetyczna(int[] tab) {
        int suma = 0;
        int ilosc = 0;
        for (int i : tab) {
            suma += i;
            ilosc++;
        }
        System.out.println(suma/ilosc);
    }
    public static void Sredniageometryczna(int[] tab) {
        double suma = 1;
        double ilosc = 0;
        for (int i : tab) {
            suma *= i;
            ilosc++;
        }
        System.out.println(Math.pow(suma,1/ilosc));
    }
    public static void SredniaHarmoniczna(int[] tab) {
        int suma = 0;
        int ilosc = 0;
        for (int i : tab) {
            suma += 1/i;
            ilosc++;
        }
        System.out.println(ilosc/suma);
    }


    public static void Sprawdzenie(String[] args) {

    }
}
// 4x3 12 elm w tab
//0+2*3=0