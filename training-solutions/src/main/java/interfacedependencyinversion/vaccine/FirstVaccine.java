package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine{
    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registered) {
        addPregnantToVaccinationList(registered);
        addEldersToVaccinationList(registered);
        addOthersToVaccinationList(registered);
    }

    private void addPregnantToVaccinationList(List<Person> registered){
        for (Person actual : registered){
            if (actual.getPregnant() == Pregnancy.YES){
                vaccinationList.add(actual);
            }
        }
    }

    private void addEldersToVaccinationList(List<Person> registered){
        for (Person actual : registered){
            if (actual.getAge() > 65 && actual.getPregnant() == Pregnancy.NO){
                vaccinationList.add(actual);
            }
        }
    }

    private void addOthersToVaccinationList(List<Person> registered){
        for (Person actual : registered){
            if (actual.getAge() <= 65 && actual.getPregnant() == Pregnancy.NO){
                vaccinationList.add(actual);
            }
        }
    }
}
