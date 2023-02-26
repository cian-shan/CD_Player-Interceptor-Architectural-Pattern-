public class CdPlayer implements IPushCallBack {
    private String playButtonName = "Play";
    private String stopButtonName = "Stop";
    
    public final void notifyButtonPushed(Context b) {
        if (b.getButtonName().equals(playButtonName)) {
            this.playButtonPushed(b.getButton());
        } else if (b.getButtonName().equals(stopButtonName)) {
            this.stopButtonPushed(b.getButton());
        }
    }
    
    public final void playButtonPushed(Button b) {
        System.out.println("Play button pushed \n");
    }
    
    public final void stopButtonPushed(Button b) {
        System.out.println("Stop button pushed \n");
    }
}