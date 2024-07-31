package CommandPattern;

public class AdjustVolumeCommand implements Command{
    Stereo stereo;

    AdjustVolumeCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.AdjustVolume();
    }
}
