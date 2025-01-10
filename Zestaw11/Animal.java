public class Animal implements Comparable<Animal>{
    int animal;
    public void setAnimal(int animal){
        this.animal = animal;
    }
    @Override
    public int compareTo(Animal other){
        return this.animal - other.animal;
    }

}
