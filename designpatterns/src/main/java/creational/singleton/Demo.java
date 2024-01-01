package creational.singleton;

public class Demo {
    public static void main(String[] args) {
        ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton anotherSingleton = ThreadSafeSingleton.getInstance();
        System.out.println(singleton.hashCode());
        System.out.println(anotherSingleton.hashCode());

        EnumSigleton enumSigleton = EnumSigleton.INSTANCE;
        EnumSigleton enumSigleton2 = EnumSigleton.INSTANCE;
        System.out.println(enumSigleton.hashCode());
        System.out.println(enumSigleton2.hashCode());
        System.out.println(enumSigleton.getValue());
        enumSigleton.setValue(2);
        System.out.println(enumSigleton.getValue());
        System.out.println(enumSigleton2.getValue());


    }
}
