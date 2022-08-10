public class TestCircle {
    public static void main(String[] args) {
        Circle cir = new Circle();
        Circle circle = new Circle(2.5);
        System.out.println(circle.getRadius() + " " + circle.getColor());
        System.out.println(circle.getArea());
    }
}
