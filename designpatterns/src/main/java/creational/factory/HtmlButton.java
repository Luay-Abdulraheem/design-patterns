package creational.factory;

public class HtmlButton implements Button {
    public void render() {
        System.out.println("HTML Button render");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! HTML Button says - 'Hello World!'");
    }
}
