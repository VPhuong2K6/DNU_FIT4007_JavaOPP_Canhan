package Part6Strings;
import java.util.Scanner;

public class Ex08PrintStarTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int N = sc.nextInt();

        String s = "";
        for (int i = 1; i <= N; i++) {
            s += "*";
            System.out.println(s);
        }
    }
}