public class Dispatcher {
    private Interceptor interceptor;
    
    public Dispatcher(Interceptor interceptor) {
        this.interceptor = interceptor;
    }
    
    public void dispatch(Context context) {
        interceptor.intercept(context);
        context.getButton().push();
    }
}