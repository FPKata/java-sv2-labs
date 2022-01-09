package methodpass.troopers;

public class Position {
    private double posX;
    private double posY;

    public Position(double positionX, double positionY) {
        this.posX = positionX;
        this.posY = positionY;
    }

    public double distanceFrom(Position position){
        if (position == null){
            throw new IllegalArgumentException("Cannot calculate distance from unknown position");
        }
        return Math.sqrt(Math.pow(posX - position.posX, 2) + Math.pow(posY - position.posY, 2));
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
}
