package Part7Methods;

public class Ex12PrintNTimes {
    public   static void printN(String s, int n) {
        for (int i = 0; i < n; i++)
            System.out.println(s);
    }

    public static void main(String[] args) {
        printN("PTIT", 3);
    }
}