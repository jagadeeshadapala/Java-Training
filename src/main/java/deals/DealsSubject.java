package deals;

public interface DealsSubject {

    public void registerSubscriber(DealsListener subscriber);
    public void unRegisterSubscriber(DealsListener subscriber);
    public void sendNotification();
}
