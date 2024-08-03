package ProxyPattern;

public class ProxyImage implements Image{
    String fileName;
    RealImage realImage;

    ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (this.realImage == null){
            this.realImage = new RealImage(fileName);
        }

        realImage.display();
    }
}
