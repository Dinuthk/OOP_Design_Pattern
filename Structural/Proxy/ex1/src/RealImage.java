public class RealImage implements Image{

    private String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Load Image : "+fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image : "+fileName);
    }
}
