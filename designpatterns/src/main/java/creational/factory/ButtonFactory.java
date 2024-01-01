package creational.factory;

public class ButtonFactory {
    public Button getButton(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("HTML")) {
            return new HtmlButton();
        } else if (type.equalsIgnoreCase("Windows")) {
            return new WindowsButton();
        }

        return null;
    }
}
