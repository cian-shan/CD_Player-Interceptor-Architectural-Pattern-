public class Context {
    private Button button;
    private String buttonName;
    
    public Context(Button button, String buttonName) {
        this.button = button;
        this.buttonName = buttonName;
    }
    
    public Button getButton() {
        return button;
    }
    
    public String getButtonName() {
        return buttonName;
    }
}