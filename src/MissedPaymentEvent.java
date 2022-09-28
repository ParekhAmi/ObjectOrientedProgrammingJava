public class MissedPaymentEvent extends AbstractEvent {

    public MissedPaymentEvent(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " missed their payment.");
    }
}
