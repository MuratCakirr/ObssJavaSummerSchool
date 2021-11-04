public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10,"blue");
        Circle circle = new Circle(5,"black");

        Pen pen = new Pen();

        pen.drawShape(rectangle);
        pen.drawShape(circle);
    }
}
