package Part7Methods;

public class Ex14ToBinary {
    public  static String toBinary(int n) {
        return Integer.toBinaryString(n);
    }

    public static void main(String[] args) {
        System.out.println(toBinary(7));
    }
}