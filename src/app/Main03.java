package app;

import java.util.Scanner;

public class Main03 {
    static double res;
    static double rate;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input income is:");
        double income;
        income = sc.nextInt();


        if (0 < income & income <= 10000) {
            rate = 2.5;
            res = income * rate / 100;
            System.out.printf("\nSum tax = %.2f", res);

        } else if (10000 < income & income <= 25000) {
            rate = 4.3;
            res = income * rate / 100;
            System.out.printf("\nSum tax = %.2f", res);

        } else if (25000 < income) {
            rate = 6.7;
            res = income * rate / 100;
            System.out.printf("\nSum tax + = %.2f", res);
        }
    }
}
