package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaDemo {
    public void useStreams(){
        List<String> names = new ArrayList<>(Arrays.asList("Mari", "Kari", "Kati", "Pati"));

        //names.forEach((String name) -> {System.out.println(name);});
        //names.forEach(name -> System.out.println(name));

        //names.replaceAll((String name) -> {return name.toUpperCase();});
        //names.replaceAll(name -> name.toUpperCase());
        //names.replaceAll(String::toUpperCase);

        //names.replaceAll(name -> toFirstCharacters(name));
        //names.replaceAll(this::toFirstCharacters);

        names.removeIf(name -> name.startsWith("Kati"));
    }

    public String toFirstCharacters(String text){
        return text.substring(0, 2);
    }
}
