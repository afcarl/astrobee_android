package gov.nasa.arc.astrobee.android.gs.manager;

/**
 * Created by kmbrowne on 11/14/17.
 */

public enum MessageType {
    MESSENGER(0),
    STOP(1),
    CMD(2),
    JSON(3),
    STRING(4),
    BINARY(5);

    private final int mValue;

    MessageType(final int value) {
        mValue = value;
    }

    public int toInt() {
        return mValue;
    }
}