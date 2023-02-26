public class Button{
/*
Button is no longer coupled with a cdPlayer object Instead a button expects an
object that implements iPushCallBack when instantiated
*/
private IPushCallBack iPushCallBack;
public Button(IPushCallBack ipcb) {
iPushCallBack = ipcb;
}
public final void push(){
/*
push method informs the client (object that implements iPushCallBack)
that it (the button) has been pushed. Note that it passes a reference to
itself (this) in order to tell the client which button it is
*/
iPushCallBack.notifyButtonPushed(this);
}
}
