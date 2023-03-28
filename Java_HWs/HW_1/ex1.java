// Вычислить n-ое треугольного число (сумма чисел от 1 до n)

package Java_HWs.HW_1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
        iScanner.close();
    }
    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}