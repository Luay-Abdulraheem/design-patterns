package creational.factory;

public class Demo {

    public static void main(String[] args) {
        ButtonFactory buttonFactory = new ButtonFactory();
        Button htmlButton = buttonFactory.getButton("HTML");
        Button windowsButton = buttonFactory.getButton("Windows");

        htmlButton.render();
        windowsButton.render();
    }
}
