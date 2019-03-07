/*Задание №9: Ввод/вывод данных для массива
Произведите ввод данных с клавиатуры в массив,
а после этого произведите вывод массива на экран,
где каждый элемент массива умножается на 2.
 */
import java.util.Scanner;

public class Task9 {
    public static void main(String args[]) {
        int mas[] = new int[5];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите число для массива: ");

            mas[i] = in.nextInt();
        }

        System.out.println("Вывод элементов массива умноженых на 2");

        for (int i = 0; i < 5; i++) {
            System.out.println(mas[i] * 2);
        }
    }
}
