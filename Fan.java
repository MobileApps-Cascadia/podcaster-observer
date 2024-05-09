class Fan implements Observer {
    String nameOfObserver;

    public Fan(String name) {
        this.nameOfObserver = name;
    }

    @Override
    public void update(String message) {
        System.out.println(
                nameOfObserver + " (a Fan) says 'WOW AN UPDATE! " + message);
    }
}