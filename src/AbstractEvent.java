
//---------------Abstraction-----------------------------

import java.sql.Timestamp;

public abstract class AbstractEvent implements Event {

    protected final Long createdTimestamp;
    protected final String id;

    public AbstractEvent(String id) {
        this.id = id;
        this.createdTimestamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public Long getTimeStamp() {
        return this.createdTimestamp;
    }

    public abstract void process();
}
