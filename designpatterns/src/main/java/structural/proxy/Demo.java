package structural.proxy;

public class Demo {
    public static void main(String[] args) {
        InternetAccess access = new ProxyInternetAccess("Luay");
        access.grantInternetAccess();
    }
}
