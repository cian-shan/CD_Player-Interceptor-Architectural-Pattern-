public class InterceptorTest {
    public static void main(String[] args) {
        ConcreteInterceptor concreteInterceptor = new ConcreteInterceptor();
        CdPlayer cdPlayer = new CdPlayer();
        IPushCallBack callBack = new IPushCallBack() {
            public void notifyButtonPushed(Context b) {
                concreteInterceptor.intercept(b);
                cdPlayer.notifyButtonPushed(b);
            }
        };

        Button playButton = new Button(callBack, "Play");
        Button stopButton = new Button(callBack, "Stop");

        Dispatcher dispatcher = new Dispatcher(concreteInterceptor);
        dispatcher.dispatch(new Context(playButton, "Play"));
        dispatcher.dispatch(new Context(stopButton, "Stop"));
    }
}
