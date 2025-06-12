/**
 * Represents a smartphone composed of battery, display, and processor components.
 * @author Kelly Fu
 * @version 17.0.1
 */
public class Smartphone {
    private Battery battery;
    private Display display;
    private Processor processor;
    private String brand;
    private String model;

    /**
     * Constructs a Smartphone using existing component objects.
     * @param brand The smartphone brand.
     * @param model The smartphone model.
     * @param battery The battery component.
     * @param display The display component.
     * @param processor The processor component.
     */
    public Smartphone(String brand, String model, Battery battery, Display display, Processor processor) {
        this.brand = brand;
        this.model = model;
        this.battery = battery;
        this.display = display;
        this.processor = processor;
    }

    /**
     * Constructs a Smartphone by creating components internally.
     * @param brand The brand name.
     * @param model The model name.
     * @param batteryCapacity Battery capacity in mAh.
     * @param displaySize Display size in inches.
     * @param resolution Display resolution.
     * @param processorModel Processor model name.
     * @param processorSpeed Processor speed in GHz.
     */
    public Smartphone(String brand, String model, int batteryCapacity,
                      double displaySize, String resolution,
                      String processorModel, double processorSpeed) {
        this.brand = brand;
        this.model = model;
        this.battery = new Battery(batteryCapacity);
        this.display = new Display(displaySize, resolution);
        this.processor = new Processor(processorModel, processorSpeed);
    }

    /**
     * Powers on the smartphone.
     * @return A string indicating the result.
     */
    public String powerOn() {
        if (battery.isCharged()) {
            return display.turnOn() + "\nPowering on " + brand + " " + model;
        } else {
            return "Cannot power on: Battery depleted";
        }
    }

    /**
     * Powers off the smartphone.
     * @return A string indicating the result.
     */
    public String powerOff() {
        return display.turnOff() + "\nPowering off " + brand + " " + model;
    }

    /** Charges the smartphone battery. */
    public void chargeBattery() {
        battery.charge();
    }

    /**
     * Runs an app on the smartphone.
     * @param appName The app to run.
     * @return A message indicating app status.
     */
    public String runApp(String appName) {
        if (display.isOn()) {
            processor.processTask(appName);
            return appName + " running.";
        } else {
            return "Phone is off. Cannot run " + appName;
        }
    }

    /**
     * Replaces the current battery with a new one.
     * @param newBattery The new battery.
     */
    public void upgradeComponent(Battery newBattery) {
        this.battery = newBattery;
    }

    /**
     * Replaces the current display with a new one.
     * @param newDisplay The new display.
     */
    public void upgradeComponent(Display newDisplay) {
        this.display = newDisplay;
    }

    /**
     * Replaces the current processor with a new one.
     * @param newProcessor The new processor.
     */
    public void upgradeComponent(Processor newProcessor) {
        this.processor = newProcessor;
    }

    @Override
    public String toString() {
        return brand + " " + model + " Smartphone\n" +
               battery.toString() + "\n" +
               display.toString() + "\n" +
               processor.toString();
    }
}
