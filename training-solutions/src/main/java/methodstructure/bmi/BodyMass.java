//package methodstructure.bmi;
//
//public class BodyMass {
//    private double weight;
//    private double height;
//
//    public BodyMass(double weight, double height) {
//        this.weight = weight;
//        this.height = height;
//    }
//     public double getBodyMassIndex(){
//         return weight / (height * height);
//     }
//
//     public BmiCategory getBody(){
//        BmiCategory category;
//        double bmi = getBodyMassIndex();
//        if (bmi < 18.5){
//            category = BmiCategory.UNDERWEIGHT;
//        }else if (bmi <25){
//            category = BmiCategory.NORMAL;
//        }else {
//            category = BmiCategory.OVERWEIGHT;
//        }
//        return category;
//     }
//
//     public boolean isThinnerThan(BodyMass other){
//        return getBodyMassIndex() < other.getBodyMassIndex();
//     }
//
//    public double getWeight() {
//        return weight;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//}
