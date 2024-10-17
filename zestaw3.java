//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.lang.Math;
public class zestaw3 {
    public static void main(int n) {
        //zad1
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                for (int k = j; k <= n; k++) {
                    if(Math.pow(i,2)+Math.pow(j,2)==Math.pow(k,2)) {
                        System.out.println(i+" "+j+" "+k);
                    }
                }
            }

        }
    }
    static void funKwaRozwiazania(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                for (int k = j; k <= n; k++) {
                    if(Math.pow(j,2)-4*i*k>=0) {
                        System.out.println(i+","+j+","+k);
                    }
                }
            }
        }
    }
    ///zad3
    static void liczbyPierwsze(int n) {
    for (int i = 2; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if (i%j==0) {
                if (i==j){
                if (j!=1)
                    System.out.println(i+" "+j);
                }

            }
        }
    }
    }
    static void liczbyPodzielne(int m, int n) {
    double x = Math.pow(10,m-1);
    for (double i = x; i <= Math.pow(10,m)-1; i++) {
        if (i%n==0) {
            System.out.print(i+" ");
        }
    }
    }
    static void piramida(int n, int variant){
        if(variant==1) {
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.print("*");
                }
            }
        }
        else if(variant==2) {
            for (int i = 1; i < n; i++) {
                for (int j = i; j < n; j++) {
                    for (int k = i-1; k < n; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("* ");
                }
            }
        }
    }
    static void silnia(int n){
        int m =1;
        for (int i = 1; i <= n; i++) {
            m=m*i;
        }
    }
    static void silniaPodwojna(int n){
        int m =1;
        for (int i = 1; i <= n; i+=2) {
            m=m*i;
        }
    }
    static void silnia2(int n, int m){
        int g =1;
        for (int i = 1; i <= n; i+=m) {
            g=g*i;
        }
    }
    static void dwumianNewtona(int n, int k){
        int h = 1;
        int m = 1;
        int g = 1;
        for (int i = 1; i <= n; i++) {
            h=h*i;
        }
        for (int i = 1; i <= k; i++) {
            m=m*i;
        }
        for (int i = 1; i <= n-k; i++) {
            g=g*i;
        }
        System.out.println(h/m*g);
    }
    ///zad11
    static void ciagFibonacciego(int n){
        int a=0,b=1;
        for (int i = 1; i <= n; i++)
        {
            System.out.print(a+" "+b+" ");
            a=a+b;
            b+=a;
        }
    }
    ///zad12
    static void SumaNaturalnych(int n){
        int suma=0;
        for (int i = 1; i <= n; i++) {
            suma=suma+i;
        }
    }
    static void SumaParzystych(int n){
        int suma=0;
        int j=0;
        for (int i = 1; i <= n; i++) {
            suma=suma+j;
            j+=2;
        }
    }
    static void SumaNieParzystych(int n){
        int suma=0;
        int j=1;
        for (int i = 1; i <= n; i++) {
            suma=suma+j;
            j+=2;
        }
    }
}
/*
*
**
***
****
   *
  * *
 * * *
* * * *
* 0 1 1 2 3 5 8 13 21 ...
 */
