package creational.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        GUIFactory guiFactory;
        String input = "Mac";
        if (input.equalsIgnoreCase("MAC")) {
            guiFactory = new MacFactory();
        } else {
            guiFactory = new WindowsFactory();
        }
        Button button = guiFactory.createButton();
        CheckBox checkBox = guiFactory.createCheckbox();
        button.paint();
        checkBox.paint();
    }
}
