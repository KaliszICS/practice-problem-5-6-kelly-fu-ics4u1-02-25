/**
 * Represents a processor component used in a smartphone.
 * @author Kelly Fu
 * @version 17.0.1
 */
public class Processor {
    private String model;
    private double speedGHz;

    /**
     * Constructs a Processor with the given model and speed.
     * @param model The processor model.
     * @param speedGHz The speed in GHz.
     */
    public Processor(String model, double speedGHz) {
        this.model = model;
        this.speedGHz = speedGHz;
    }

    /**
     * Simulates processing a task.
     * @param task The task to process.
     * @return A string representing the task being processed.
     */
    public String processTask(String task) {
        return "Processing " + task + " with " + model + " at " + speedGHz + " GHz";
    }

    /** @return The processor model. */
    public String getModel() {
        return model;
    }

    /** @return The processor speed in GHz. */
    public double getSpeedGHz() {
        return speedGHz;
    }

    @Override
    public String toString() {
        return "Processor: " + model + ", " + speedGHz + " GHz";
    }
}
