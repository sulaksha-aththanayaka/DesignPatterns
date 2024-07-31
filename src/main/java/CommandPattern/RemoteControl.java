package CommandPattern;

public class RemoteControl {
    Command command;

    RemoteControl(){};

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
