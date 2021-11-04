import java.util.EventObject;

public class ClickEvent extends EventObject {
    private String name = "Murat";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClickEvent(Object o) {
        super(o);
    }
}
