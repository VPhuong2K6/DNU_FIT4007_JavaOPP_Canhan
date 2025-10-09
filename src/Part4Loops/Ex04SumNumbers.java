package Part4Loops;

import java.util.Scanner;
public class Ex04SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên N: ");
        int N  = sc.nextInt();
        int tong = 0;
        for (int i = 1; i <= N; i++) {
            tong += i ;
        }
        System.out.println("Tổng từ 1 đến " + N + " là : " + tong);
    }
}