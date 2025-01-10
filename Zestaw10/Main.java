import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var student = new Student("tomek",3.4,12);
        var student2 = new Student("romek",3.2,11);
        ArrayList<Student> studenci = new ArrayList<>();
        studenci.add(student);
        studenci.add(student2);
        studenci.add(student2);

        studenci.sort(null);
        System.out.println(studenci);

        Car car1 = new Car("audi",456,123);
        Car car2 = new Car("lambo",67,1233);
        Car car3 = new Car("porshe",1,1234);
        Car car4 = new Car("bugatti",218,1235);

        Car[] tablica = {car1,car2,car3,car4};
        Arrays.sort(tablica);
        for(var i:tablica){
            System.out.println(i);
        }


    }
}