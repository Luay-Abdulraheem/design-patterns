package creational.factory;

public class WindowsButton implements Button {
    public void render() {
        System.out.println("Windows Button render");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Windows Button says - 'Hello World!'");
    }
}
