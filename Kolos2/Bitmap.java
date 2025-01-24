public class Bitmap extends ComputerGraphic{
    Bitmap(int width, int height,String filename){
        this.width = width;
        this.height = height;
        this.fileName = filename;
    }
    @Override
    void saveFile() {
        System.out.println("Saving Bitmap " + fileName);
    }

    @Override
    void loadFile() {
        System.out.println("Loading Bitmap " + fileName);
    }
}
