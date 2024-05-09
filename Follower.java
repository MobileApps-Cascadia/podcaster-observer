class Follower implements Observer {
    String nameOfObserver;

    public Follower(String name) {
        this.nameOfObserver = name;
    }

    @Override
    public void update(String message) {
        System.out.println(nameOfObserver + " (a Follower) has received an update that the value is  " + message);
    }
}