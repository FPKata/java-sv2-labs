package introexceptiontrycatchtrace;

public class Jackpot {
    public static void main(String[] args) {
        Winner winner = new Winner();
        try{
            String person = winner.getWinner();
            System.out.println(person);
        }
        catch(NullPointerException npe){
            System.out.println("Érvénytelen név");
        }
    }
}
