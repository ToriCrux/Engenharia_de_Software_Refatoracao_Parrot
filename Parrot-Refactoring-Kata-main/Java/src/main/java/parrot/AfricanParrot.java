package parrot;

public class AfricanParrot extends Parrot {
    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        double baseSpeed = getBaseSpeed();
        double loadImpact = getLoadFactor() * numberOfCoconuts;
        double adjustedSpeed = baseSpeed - loadImpact;

        return Math.max(0, adjustedSpeed);
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }
}
