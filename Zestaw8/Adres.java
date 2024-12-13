import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Adres {
    private String Ulica;
    private int NumerDomu;
    private int NumerMieszkania;
    private String Miasto;
    private String Kod_Pocztowy;
    Adres(String Ulica, int NumerDomu, int NumerMieszkania, String Miasto,  String Kod_Pocztowy) {
        this.Ulica = Ulica;
        this.NumerDomu = NumerDomu;
        this.NumerMieszkania = NumerMieszkania;
        this.Miasto = Miasto;
        this.Kod_Pocztowy = Kod_Pocztowy;
    }
    Adres(String Ulica, int NumerDomu, String Miasto,  String Kod_Pocztowy) {
        this.Ulica = Ulica;
        this.NumerDomu = NumerDomu;
        this.Miasto = Miasto;
        this.Kod_Pocztowy = Kod_Pocztowy;
    }
    void Pokaz() {
        System.out.println(this.Kod_Pocztowy + " " + this.Miasto);
        if(this.NumerMieszkania == 0) {
            System.out.println(Ulica + " " + NumerDomu);
        }
        else  {
            System.out.println(Ulica + " " +NumerDomu+ "/" + NumerMieszkania);
        }
    }

    void przed(String kod_Pocztowy1,String kod_Pocztowy2) {
        ArrayList<String> kod1 =new ArrayList<String>(Arrays.asList(kod_Pocztowy1.split("-")));
        ArrayList<String> kod2 = new ArrayList<String>(Arrays.asList(kod_Pocztowy2.split("-")));


    }

}
