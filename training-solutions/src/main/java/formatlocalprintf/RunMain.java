package formatlocalprintf;

public class RunMain {
    public static void main(String[] args) {
        Run run = new Run("FPK");
        run.addRun(11.1);
        run.addRun(22.2);
        run.addRun(33.3);
        run.addRun(9.934);
        run.printFormattedRunText();
    }
}
