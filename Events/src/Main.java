
public class Main {

    public static void main(String[] args) {
        Form form = new Form();
        Button button = new Button("button");
        Button button1 = new Button("button 1");
        form.setButton(button);
        form.setButton(button1);
        button.addMouseClickListener(form);
        button1.addMouseClickListener(form);
        button.click();
        button1.click();

    }
}
