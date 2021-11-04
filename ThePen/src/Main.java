public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(5,"blue");
        Rectangle rectangle = new Rectangle(5,10,"black");
        Pen pen = new Pen();

        pen.changeColorCircle("yellow",circle);
        pen.changeColorRectangle("green",rectangle);
        pen.drawCircle(circle);
        pen.drawRectangle(rectangle);

    }
}
