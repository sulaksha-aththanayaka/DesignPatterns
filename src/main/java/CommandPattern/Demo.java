package CommandPattern;

public class Demo {
    public static void main(String[] args){
        Television tv = new Television();
        Stereo stereo = new Stereo();

        Command turnTvOn = new TurnOnCommand(tv);
        Command turnTvOff = new TurnOffCommand(tv);
        Command changeChannel = new ChangeChannelCommand(tv);
        Command adjustVolume = new AdjustVolumeCommand(stereo);

        turnTvOn.execute();
        turnTvOff.execute();
        changeChannel.execute();
        adjustVolume.execute();
    }
}
