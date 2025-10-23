package Part7Methods;
public class Ex19PerfectSquare {
    public static boolean isPerfectSquare(int n) {
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(25));
    }
}