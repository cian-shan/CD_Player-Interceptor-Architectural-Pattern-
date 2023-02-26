public class ConcreteInterceptor implements Interceptor {
    public void intercept(Context context) {
        System.out.println("Intercepted: " + context.getButtonName());
    }
}