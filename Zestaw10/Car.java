public class Car implements Comparable<Car>{
    public String name;
    public int mileage;
    public int yearOfProduction;

    public Car(String name, int mileage, int yearOfProduction) {
        this.name = name;
        this.mileage = mileage;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public int compareTo(Car o) {
        if(this.mileage < o.mileage) return -1;
        if(this.mileage > o.mileage) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", mileage=" + mileage +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
