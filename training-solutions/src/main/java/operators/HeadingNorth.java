package operators;

public class HeadingNorth {
    public int getNumberOfNewDirection(){
        int angle = 0;
        int number = 0;
        while (angle < 360){
            angle = angle + 10 * (number + 1);
            number++;
        }
        return number;
    }
    public static void main(String[] args) {
        HeadingNorth headingNorth = new HeadingNorth();
        System.out.println(headingNorth.getNumberOfNewDirection());
    }
}
