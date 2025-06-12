/**
 * Represents a smartphone display component.
 * @author Kelly Fu
 * @version 17.0.1
 */
public class Display {
    private double sizeInches;
    private String resolution;
    private boolean isOn = false;

    /**
     * Constructs a Display with the specified size and resolution.
     * @param sizeInches The size in inches.
     * @param resolution The screen resolution.
     */
    public Display(double sizeInches, String resolution) {
        this.sizeInches = sizeInches;
        this.resolution = resolution;
    }

    /**
     * Turns on the display.
     * @return A string representing the display state.
     */
    public String turnOn() {
        isOn = true;
        return "Display turned on. " + sizeInches + "-inch, " + resolution;
    }

    /**
     * Turns off the display.
     * @return A string representing the display state.
     */
    public String turnOff() {
        isOn = false;
        return "Display turned off.";
    }

    /** @return The size of the display in inches. */
    public double getSizeInches() {
        return sizeInches;
    }

    /** @return The display resolution. */
    public String getResolution() {
        return resolution;
    }

    /** @return Whether the display is currently on. */
    public boolean isOn() {
        return isOn;
    }

    @Override
    public String toString() {
        return "Display: " + sizeInches + " inches, " + resolution;
    }
}
