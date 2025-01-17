class Animal implements Comparable<Animal>{
    public int wiek;

    public Animal(int wiek) {
        this.wiek = wiek;
    }
    @Override
    public int compareTo(Animal other){
        return wiek - other.wiek;
    }
}
class Dog extends Animal{
    public Dog(int wiek) {
        super(wiek);
    }
}
