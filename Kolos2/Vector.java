public class Vector extends ComputerGraphic{
    Vector(int width, int height){
        this.width = width;
        this.height = height;
    }
    @Override
    void loadFile() {
        System.out.println("Loading Vector ("+width+","+height+")");
    }

    @Override
    void saveFile() {
        System.out.println("Saving Vector ("+width+","+height+")");
    }
}
