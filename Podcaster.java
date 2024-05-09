import java.util.ArrayList;
import java.util.List;

class Podcaster implements Subject {
    private String flag;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
        // Flag value changed. So notify registered users/observers.
        notifyFollowers(flag);
    }

    List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void register(Observer anObserver) {
        observerList.add(anObserver);
    }

    @Override
    public void unregister(Observer anObserver) {
        observerList.remove(anObserver);
    }

    @Override
    public void notifyFollowers(String message) {
        for (Observer observer : observerList)
            observer.update(message);
    }
}