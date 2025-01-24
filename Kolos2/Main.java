import java.util.Arrays;

public class Main {
    public static <T extends Comparable<T>> void sortDescending(T[] array)
    {
        for (int i = 1; i < array.length; i++){
            for (int j = i; j > 0; j--){
                if (array[j-1].compareTo(array[j]) < 0){
                    T temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
    Building build1 = new Building(10,"blue");
    House house1 = new House(40,"yellow",20);
    AdminAuthentication admin = new AdminAuthentication("password","Admin");
        System.out.println(admin.login("password","Admin"));
        admin.logout();
        System.out.println(admin.resetPassword("password","Admin","addMin"));
        System.out.println( admin.login("password","Admin"));
        System.out.println(  admin.login("password","addMin"));
        System.out.println( admin.resetPassword("password","Admin","addMin"));
        String[] tab= {"chleb","maslo","borowki"};
        sortDescending(tab);
        System.out.print(tab[0]+", ");
        System.out.print(tab[1]+", ");
        System.out.println(tab[2]);
        Vector v = new Vector(1,2);
        v.loadFile();
        v.saveFile();
        Bitmap b = new Bitmap(1,2,"bit");
        b.saveFile();
        b.loadFile();




    }
}