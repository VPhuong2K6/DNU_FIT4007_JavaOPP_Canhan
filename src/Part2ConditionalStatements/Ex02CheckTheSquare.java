package part2.conditional.statements;
import java.util.Scanner;
public class Ex02CheckTheSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double a = sc.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double b = sc.nextDouble();

        if ( a == b ) {
            System.out.println("Đây là hình vuông");
        } else {
            System.out.println("Đây không phải là hình vuông");
        }
    }
}