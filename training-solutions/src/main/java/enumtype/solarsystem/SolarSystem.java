package enumtype.solarsystem;

import java.util.List;

public enum SolarSystem {
        MERCURY(0), VENUS(0), EARTH(1), MARS(2), JUPITER(16), SATURN(23), URANUS(15),
        NEPTUNE(8);
        private int moon;
        SolarSystem(int moon){
            this.moon = moon;
        }
        public int getMoon(){
            return moon;
        }
}
