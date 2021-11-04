import java.awt.*;

public class Form implements MouseListener {

    private Button button;

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    @Override
    public void mouseClicked(ClickEvent clickEvent) {
        System.out.println("Hello " + clickEvent.getName() + " " + button.getName());

    }
}
