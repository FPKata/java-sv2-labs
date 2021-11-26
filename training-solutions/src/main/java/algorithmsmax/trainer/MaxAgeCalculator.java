package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {
    public Trainer getTrainerWithMaxAge(List<Trainer> trainers){
        Trainer trainerWithMaxAge = trainers.get(0);
        for (Trainer actual : trainers){
            if (actual.getAge() > trainerWithMaxAge.getAge()){
                trainerWithMaxAge = actual;
            }
        }
        return trainerWithMaxAge;
    }
}
