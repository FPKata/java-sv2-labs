package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<FamilyMember> familyMembers;

    public Family() {
        this.familyMembers = new ArrayList<>();
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String firstName){
        List<Integer> result = new ArrayList<>();
        for (FamilyMember actual : familyMembers){
            if (actual.getName().contains(firstName)){
                result.add(actual.getAge());
            }
        }
        return result;
    }

    public void addFamilyMember(FamilyMember member){
        familyMembers.add(member);
    }

    public List<FamilyMember> getFamily() {
        return familyMembers;
    }
}
