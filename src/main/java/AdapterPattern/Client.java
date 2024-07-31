package AdapterPattern;

public class Client {
    public static void main(String[] args){
        ColorPrinter colorPrinter = new ColorPrinter();
        PrintAdapter adapter = new PrintAdapter(colorPrinter);

        adapter.print();
    }
}
