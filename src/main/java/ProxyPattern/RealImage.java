package ProxyPattern;

public class RealImage implements Image{
    String fileName;

    RealImage(String fileName){
        this.fileName = fileName;
        loadImageFromDisk();
    }

    public void loadImageFromDisk(){
        System.out.println("Image loaded from the disk");
    }

    @Override
    public void display() {
        System.out.println("Display the image");
    }
}
