package controlselection.greetings;

public class Greetings {


    public String sayGreeting(int hour, int minutes){
        String result;
        int inMinutes = hour * 60 + minutes;
        if (inMinutes <= 300 || inMinutes > 1200){
            result = "Jó éjt!";
        }
        else if (inMinutes > 300 && inMinutes <= 540){
            result = "Jó reggelt!";
        }
        else if (inMinutes > 540 && inMinutes <= 1110){
            result = "Jó napot!";
        }
        else{
            result = "Jó estét!";
        }
        return result;
    }
}
