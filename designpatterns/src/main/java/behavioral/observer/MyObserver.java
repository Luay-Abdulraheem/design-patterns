package behavioral.observer;

public class MyObserver implements Observer {

    private String name;
    private Topic topic;

    public MyObserver(String name){
        this.name = name;
    }
    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name+":: No new message");
        }else
            System.out.println(name+":: Consuming message::"+msg);
    }

    @Override
    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
