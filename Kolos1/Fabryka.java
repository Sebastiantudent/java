import java.util.ArrayList;
import java.util.Objects;

public class Fabryka {
   private ArrayList<Elf> listaElfow;
   private double dlGeo;
   private double szGeo;
    public Fabryka(ArrayList<Elf> lista, double dlGeo, double szGeo) {
        this.listaElfow = lista;
        this.dlGeo = dlGeo;
        this.szGeo = szGeo;
    }
    void dodajPracownika(Elf elf) {
        listaElfow.add(elf);
    }
    void usunPracownika(Elf elf) {
        listaElfow.remove(elf);
    }
    Elf najstarszyPracownik() {
        Elf najstarzy = listaElfow.get(0);
        for(int i = 1;i<listaElfow.size();i++) {
            if(najstarzy.getWiek() < listaElfow.get(i).getWiek()) {
                najstarzy = listaElfow.get(i);
            }
        }
        return najstarzy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fabryka fabryka = (Fabryka) o;
        return Double.compare(dlGeo, fabryka.dlGeo) == 0 && Double.compare(szGeo, fabryka.szGeo) == 0 && Objects.equals(listaElfow, fabryka.listaElfow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listaElfow, dlGeo, szGeo);
    }

    @Override
    public String toString() {
        return "Fabryka{" +
                "listaElfow=" + listaElfow +
                ", dlGeo=" + dlGeo +
                ", szGeo=" + szGeo +
                '}';
    }

    public void setListaElfow(ArrayList<Elf> listaElfow) {
        if(listaElfow == null){
            throw new IllegalArgumentException("ListaElfow cannot be null");

        } else {
            this.listaElfow = listaElfow;
        }
    }

    public ArrayList<Elf> getListaElfow() {
        return listaElfow;
    }

    public void setDlGeo(double dlGeo) {
        if(dlGeo>180 || dlGeo<-180) {
            throw new IllegalArgumentException("DlGeo must be between -180 and 180");
        }
        else {
            this.dlGeo = dlGeo;
        }
    }

    public void setSzGeo(double szGeo) {
        if(szGeo>90 || szGeo<-90) {
            throw new IllegalArgumentException("SzGeo must be between -90 and 90");
        }
        else {
            this.szGeo = szGeo;
        }
    }

    public double getDlGeo() {
        return dlGeo;
    }

    public double getSzGeo() {
        return szGeo;
    }
}
