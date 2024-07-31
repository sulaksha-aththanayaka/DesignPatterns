package CommandPattern;

public class ChangeChannelCommand implements Command{
    Television tv;

    ChangeChannelCommand(Television tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.ChangeChannel();
    }
}
