interface Subject {
    void register(Observer anObserver);

    void unregister(Observer anObserver);

    void notifyFollowers(String message);
}