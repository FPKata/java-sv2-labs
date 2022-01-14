package interfacerules.commonproperties;

public class Equator implements Length, Name{
    private static final String NAME_OF_EQUATOR = "EQUATOR";
    private static final double LENGTH_OF_EQUATOR = 40075.0;

    @Override
    public double getLength() {
        return LENGTH_OF_EQUATOR;
    }

    @Override
    public String getName() {
        return NAME_OF_EQUATOR;
    }
}
