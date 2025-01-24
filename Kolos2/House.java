public class House extends Building {
    int numberOfRooms;
    public House(int numberOfRooms,String color,int height) {
        super(height,color);
        this.numberOfRooms = numberOfRooms;
    }
}
