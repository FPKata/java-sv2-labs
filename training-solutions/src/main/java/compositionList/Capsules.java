package compositionList;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> colors = new ArrayList<>();

    public void addLast(String color){
        colors.add(color);
    }

    public void removeLast(){
        colors.remove(colors.size() - 1);
    }

    public void addFirst(String color){
        colors.add(0, color);
    }

    public void removeFirst(){
        colors.remove(0);
    }
    public List<String> getColors(){
        return colors;
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addFirst("0");
        capsules.addFirst("1");
        capsules.addFirst("3");
        capsules.addFirst("4");
        capsules.addFirst("5");
        System.out.println(capsules.getColors());
        capsules.addLast("6");
        capsules.addLast("7");
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        capsules.removeLast();
        System.out.println(capsules.getColors());
    }
}
