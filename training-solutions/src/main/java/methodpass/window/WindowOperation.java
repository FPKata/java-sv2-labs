package methodpass.window;

import java.util.List;

public class WindowOperation {
    public void riseSize(List<Window> windows, int plusSize){
        for (Window actual : windows){
            int height = actual.getHeight();
            actual.setHeight(height + plusSize);
        }
    }
}
