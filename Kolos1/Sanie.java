import java.util.ArrayList;
import java.util.Objects;

public class Sanie {
    private ArrayList<Renifer> listaReniferow;
    Sanie(ArrayList<Renifer> listaReniferow) {
        this.listaReniferow = listaReniferow;
    }
    void dodajRenifera(Renifer renifer){
        listaReniferow.add(renifer);
    }
    int sumaPredkosci(){
        int suma = 0;
        for (Renifer renifer : listaReniferow) {
            suma += renifer.getPredkosc();
        }
        return suma;
    }
    Renifer najwolniejszyRenifer(){
        Renifer najwolnieszy = listaReniferow.get(0);
        for(int i = 1; i < listaReniferow.size(); i++){
            if(najwolnieszy.getPredkosc() > listaReniferow.get(i).getPredkosc()){
                najwolnieszy = listaReniferow.get(i);
            }
        }
        return najwolnieszy;
    }

    public void setListaReniferow(ArrayList<Renifer> listaReniferow) {
        if(listaReniferow == null){
            throw new IllegalArgumentException("ListaReniferow cannot be null");

        } else {
            this.listaReniferow = listaReniferow;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sanie sanie = (Sanie) o;
        return Objects.equals(listaReniferow, sanie.listaReniferow);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(listaReniferow);
    }

    @Override
    public String toString() {
        return "Sanie{" +
                "listaReniferow=" + listaReniferow +
                '}';
    }

    public ArrayList<Renifer> getListaReniferow() {
        return listaReniferow;
    }
}
