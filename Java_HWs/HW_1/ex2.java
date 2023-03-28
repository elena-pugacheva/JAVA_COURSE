// Вычислить n! (произведение чисел от 1 до n)

package Java_HWs.HW_1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = iScanner.nextInt();
        iScanner.close();
        int result = 1;
        
        for ( int i = 1; i <= n; i++ ) {
            result *= i;
        }
        System.out.println(result);
    }
}
    

