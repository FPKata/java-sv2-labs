package introexceptionthrowjunit5;

public class Tank {
    private int angle;

    public Tank(int angle) {
        this.angle = angle;
    }

    public void modifyAngle(int angle)
    {
        if (Math.abs(this.angle + angle) > 80){
            throw new IllegalArgumentException("Cannot rotate that much");
        }
        this.angle += angle;
    }
    public int getAngle() {
        return angle;
    }
}
