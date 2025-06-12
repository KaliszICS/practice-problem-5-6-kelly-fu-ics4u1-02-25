/**
 * Represents a battery used in a smartphone.
 * @author Kelly Fu
 * @version 17.0.1
 */
public class Battery {
    private int capacityMAh;
    private boolean isCharged = false;

    /**
     * Constructs a Battery with the specified capacity.
     * @param capacityMAh The capacity in milliamp-hours.
     */
    public Battery(int capacityMAh) {
        this.capacityMAh = capacityMAh;
    }

    /** Charges the battery. */
    public void charge() {
        isCharged = true;
    }

    /** @return Whether the battery is charged. */
    public boolean isCharged() {
        return isCharged;
    }

    /** @return The battery capacity in mAh. */
    public int getCapacityMAh() {
        return capacityMAh;
    }

    @Override
    public String toString() {
        return "Battery: " + capacityMAh + " mAh, Charged: " + isCharged;
    }
}
