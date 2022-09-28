public class AccountTransferEvent extends AbstractEvent {

    public AccountTransferEvent(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " needs to transfer the account.");
    }
}
