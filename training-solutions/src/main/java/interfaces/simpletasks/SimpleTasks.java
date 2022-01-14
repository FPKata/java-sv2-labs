package interfaces.simpletasks;

import java.util.ArrayList;
import java.util.List;

public class SimpleTasks implements Runnable{
    private List<String> tasks;

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public void run() {
        while (!tasks.isEmpty()){
            nextStep();
        }
    }

    private boolean nextStep(){
        if (tasks != null && !tasks.isEmpty()){
            tasks.remove(tasks.size() - 1);
            if (tasks.size() > 0){
                return true;
            }
        }
        return false;
    }
}
