import java.util.ArrayList;

public class Button {
    ArrayList<MouseListener> mouseListeners = new ArrayList<>();
    private String name;

    public Button(String name){
        this.name = name;
    }

    public void addMouseClickListener(MouseListener mouseListener){
        mouseListeners.add(mouseListener);
    }

    public void removeMouseClickListener(){
    }

    public void click(){

        for (MouseListener mouseListener:mouseListeners) {
            mouseListener.mouseClicked(new ClickEvent(this));
        }

    }

    public String getName() {
        return name;
    }
}
