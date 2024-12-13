import java.util.ArrayList;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public void fuelCost(double fulPrice, double distance){

    }
    public static void main(String[] args) {
    ArrayList<Double> oceny = new ArrayList<Double>();
    oceny.add(1.0);
    oceny.add(2.0);
    oceny.add(3.0);
    oceny.add(4.0);
    MusicAlbum PolskiJazz = new MusicAlbum("Jazz","Jake Balboa", oceny);
    RockAlbum RockowyJazz = new RockAlbum("Jazz","Jake Balboa", oceny,"rock and Jazz");
    PolskiJazz.setArtist("Pogba");

    PolskiJazz.addRatings(3.0);
    PolskiJazz.toString();
    PolskiJazz.removeRatings(4);
    RockowyJazz.setRockgenre("Rock and Roll");

    record BookDTO(String title, String author, Double price, String genre) {}
        BookDTO fantasy = new BookDTO("Wiedzmin", "Sapkowski", 17.00,"fanstasy");
        BookDTO Science_fiction = new BookDTO("Avatar", "ktos", 18.00,"Science Fiction");

       record Address(String street,int housenumber, String city, String Postalcode) {}
        record Osoba(Address address,String name,String Lastname) {}
        record Car(String brand, String model, double fuelConsuptionPer100km) {}
        Car car = new Car("Bmw","h1t",73.70);// 73.70/100 = 1km/koszt

       // RockowyJazz.equals(PolskiJazz);
    }


}