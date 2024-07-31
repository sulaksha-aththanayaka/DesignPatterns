package AdapterPattern;

public class PrintAdapter implements Printer{
    ColorPrinter colorPrinter;

    PrintAdapter(ColorPrinter colorPrinter){
        this.colorPrinter = colorPrinter;
    }

    @Override
    public void print() {
        colorPrinter.printColor();
    }
}
