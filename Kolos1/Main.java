import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Elf elf = new Elf("Sebastian","Budowniczy",103);
        Elf elf1 = new Elf("Olaf","Budowniczy",23);
        Elf elf2 = new Elf("Marcin","Budowniczy",12);
        Elf elf3 = new Elf("Zosia","Budowniczy",53);
        Elf elf4 = new Elf("Gosia","Budowniczy",113);
    elf.przedstawSie();
        ArrayList<Elf> elflist = new ArrayList<>();
        elflist.add(elf);
        elflist.add(elf1);
        elflist.add(elf2);
        elflist.add(elf3);
        Fabryka fabryka = new Fabryka(elflist,13.1,23.7);
        fabryka.dodajPracownika(elf4);
        fabryka.usunPracownika(elf4);
        //fabryka.setDlGeo(10.10);
        //fabryka.setSzGeo(1);
        //elf.setWiek(-21);

       System.out.println(fabryka.najstarszyPracownik().getImie());
       Renifer renifer = new Renifer("Bogdan",25);
        Renifer renifer1 = new Renifer("Bociech",18);
        Renifer renifer2 = new Renifer("Bożena",20);
        Renifer renifer3 = new Renifer("Bonbor",32);
        ArrayList<Renifer> reniferlist = new ArrayList<>();
        reniferlist.add(renifer);
        reniferlist.add(renifer1);
        reniferlist.add(renifer2);
        Sanie sanie = new Sanie(reniferlist);
        sanie.dodajRenifera(renifer3);
       // renifer.setImie("");
        //renifer.setImie(null);
        //renifer.setPredkosc(-11);
        System.out.println(sanie.najwolniejszyRenifer().getImie());
       renifer.nakarmRenifera();
       renifer.nakarmRenifera();
       System.out.println(renifer.getPredkosc());
       
       //elf.setImie("");
    }
}