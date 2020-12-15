//2.4.1 Сумма четных положительных элементов массива

package homework2.arrays;

import java.util.Scanner;

public class ArrayMain1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int[] container = new int[n];
        System.out.println("Исходный массив: ");
        int sum = 0;

        for (int m = 0; m < n; m++) {
            container[m] = (int) (Math.random() * 20);
            System.out.print(container[m] + "\t");
        }
        for (int i : container)
            if ((i > 0) && (i % 2 == 0)) {
                sum += i;
            }
        System.out.println("\nСумма четных положительных элементов массива: " + sum);
    }
}