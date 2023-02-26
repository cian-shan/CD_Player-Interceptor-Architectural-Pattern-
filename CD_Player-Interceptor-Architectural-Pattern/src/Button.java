public class Button {
    private IPushCallBack iPushCallBack;
    private String buttonName;
    
    public Button(IPushCallBack ipcb, String buttonName) {
        iPushCallBack = ipcb;
        this.buttonName = buttonName;
    }
    
    public final void push() {
        iPushCallBack.notifyButtonPushed(new Context(this, buttonName));
    }
}
