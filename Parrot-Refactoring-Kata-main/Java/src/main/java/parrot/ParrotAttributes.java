package parrot;

public class ParrotAttributes {
    public final ParrotTypeEnum type;
    public final int numberOfCoconuts;
    public final double voltage;
    public final boolean isNailed;

    public ParrotAttributes(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }
}
