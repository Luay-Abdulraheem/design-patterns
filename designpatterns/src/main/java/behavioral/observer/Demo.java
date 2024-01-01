package behavioral.observer;

public class Demo {
    public static void main(String[] args) {
        //create subject
        MyTopic topic = new MyTopic();

        //create observers
        Observer obj1 = new MyObserver("Obj1");
        Observer obj2 = new MyObserver("Obj2");
        Observer obj3 = new MyObserver("Obj3");

        //register observers to the topic
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        //attach observer to topic
        obj1.setTopic(topic);
        obj2.setTopic(topic);
        obj3.setTopic(topic);

        //check if any update is available
        obj1.update();

        //now send message to topic
        topic.postMessage("New Message");
    }
}
