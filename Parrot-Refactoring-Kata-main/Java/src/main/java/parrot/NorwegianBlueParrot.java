package parrot;

public class NorwegianBlueParrot extends Parrot {
    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        boolean cannotFly = isNailed;
        double voltageSpeed = getSpeedWithVoltage(voltage);

        return cannotFly ? 0 : voltageSpeed;
    }

    @Override
    public String getCry() {
        return voltage > 0 ? "Bzzzzzz" : "...";
    }
}
