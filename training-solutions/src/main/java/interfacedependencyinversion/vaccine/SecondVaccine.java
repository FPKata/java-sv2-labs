package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine{
    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registered) {
        addYoungPeopleToVaccinationList(registered);
        addEldersToVaccinationList(registered);
    }

    private void addEldersToVaccinationList(List<Person> registered) {
        for (Person actual : registered){
            if (actual.getAge() > 65 && actual.getPregnant() == Pregnancy.NO
                    && actual.getDisease() == ChronicDisease.NO){
                vaccinationList.add(actual);
            }
        }
    }

    private void addYoungPeopleToVaccinationList(List<Person> registered) {
        for (Person actual : registered){
            if (actual.getAge() <= 65 && actual.getPregnant() == Pregnancy.NO
                    && actual.getDisease() == ChronicDisease.NO){
                vaccinationList.add(actual);
            }
        }
    }
}
