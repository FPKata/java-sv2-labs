package introexceptioncheckedtrace;

import java.io.IOException;
import java.util.List;

public class Underground {
    public static void main(String[] args) {
        try{
            List<String> list = new Operations().readFile();
            System.out.println(new Operations().getDailySchedule(list));
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
