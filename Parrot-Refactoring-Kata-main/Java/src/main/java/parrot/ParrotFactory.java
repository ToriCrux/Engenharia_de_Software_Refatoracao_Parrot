package parrot;

public class ParrotFactory {
    public static Parrot createParrot(ParrotAttributes attributes) {
        return switch (attributes.type) {
            case EUROPEAN -> new EuropeanParrot();
            case AFRICAN -> new AfricanParrot(attributes.numberOfCoconuts);
            case NORWEGIAN_BLUE -> new NorwegianBlueParrot(attributes.voltage, attributes.isNailed);
        };
    }
}
