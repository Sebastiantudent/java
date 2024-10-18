import java.lang.Math;
import java.util.Scanner;
/*
class zad2 {
    public static void main(String[] args) {
        double a = ((Math.sqrt(7)-1)/2)+Math.pow(3,3)%2;
        int b = (int)a;
        System.out.println(b);
        double c = 2004/(21*5);
        int d = (int)c;
        System.out.println(d);
        double e = (3 + Math.sqrt(3))/(Math.sqrt(5)/2)/3 + 1;
        int f = (int)e;
        System.out.println(f);
        double g = 125%2%5;
        int h = (int)g;
        System.out.println(h);
        double i = (6%9+1)/Math.pow(2,1/4);
        int j = (int)i;
        System.out.println(j);
        
    }
}
*/
/*
class zad3 {
    public static void main(String[] args) {
    Scanner slowo1 = new Scanner(System.in);
    System.out.println("Wpisz pierwsze slowo");
    String a = slowo1.nextLine();
    Scanner slowo2 = new Scanner(System.in);
    System.out.println("Wpisz drugie slowo");
    String b = slowo2.nextLine();
        System.out.println(a + " " + b);
    }
}
*/
/*
class zad4 {
    public static void main(String[] args) {
    Scanner liczba1 = new Scanner(System.in);
    System.out.println("Wpisz pierwsza liczbe");
    int a = liczba1.nextInt();
    Scanner liczba2 = new Scanner(System.in);
    System.out.println("Wpisz druga liczbe");
    int b = liczba2.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
*/
class zad5 {
    public static void main(String[] args) {
 Scanner reader = new Scanner(System.in);
        System.out.println("wpisz 1 liczbe: ");
        int liczba = reader.nextInt();
        System.out.println(liczba+140);
        System.out.println(liczba-31);
        System.out.println(liczba*7);
        System.out.println((float)liczba/13);
        System.out.println(liczba%7);
        System.out.println((liczba/4));
        System.out.println((float)(Math.pow(liczba,45)));
        System.out.println(liczba&59);
        System.out.println(liczba^23);
        System.out.println(liczba<<5);
        System.out.println(liczba>>6);
        reader.close();
      }
}
