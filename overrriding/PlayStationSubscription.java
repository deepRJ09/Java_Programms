class PlayStationSubscriptionBase {
    public void subscriptionBenefits() {
        System.out.println("Basic gaming benefits");
    }
}

public class PlayStationSubscription extends PlayStationSubscriptionBase {
    @Override
    public void subscriptionBenefits() {
        System.out.println("Online multiplayer, monthly games, and exclusive discounts");
    }

    public static void main(String[] args) {
        PlayStationSubscriptionBase subscription = new PlayStationSubscription();
        subscription.subscriptionBenefits();
    }
}