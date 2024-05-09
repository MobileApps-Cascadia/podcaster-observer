public class ObserverPatternExample {
    public static void main(String[] args) {
        System.out.println(" ***Observer Pattern Demo***\n");
        // We have 3 observers- 2 of them are ObserverType1, 1 of them is of ObserverType2
        Observer myObserver1 = new Follower("Nadir");
        Observer myObserver2 = new Follower("Pasha");
        Observer myObserver3 = new Fan("Bose");
        Podcaster podcaster = new Podcaster();
        // Registering the observers
        podcaster.register(myObserver1);
        podcaster.register(myObserver2);
        podcaster.register(myObserver3);
        System.out.println(" Subject's state changes to 'New Episode Posted' ");
        podcaster.setFlag("New Episode Posted");
        // Unregistering an observer - Nadir
        podcaster.unregister(myObserver1);
        // Notice Nadir will not receive notifications this time
        System.out.println("\n Subject's state changes to 'Live Show Announced' ");
        podcaster.setFlag("Live Show Announced");
        // Nadir is registered again
        podcaster.register(myObserver1);
        System.out.println("\n Subject's state changes to 'Website Update' ");
        podcaster.setFlag("Website Update");
    }
}