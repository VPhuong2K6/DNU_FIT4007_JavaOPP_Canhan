package Part7Methods;

public class Ex13TriangleArea {
    public static double triangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        System.out.println(triangleArea(3, 4, 5));
    }
}
