/*Итоговая задача №2 Задание
Написать программу сортировки по возрастанию заданного пользователем массива чисел
 */

import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int mas[] = new int[in.nextInt()];

        for (int i = 0; i < mas.length; i++) {
            System.out.print("Введите число для массива: ");
            mas[i] = in.nextInt();
        }

        for(int i = mas.length-1 ; i > 0 ; i--) {
            for(int j = 0 ; j < i ; j++) {
                if( mas[j] > mas[j+1] ){
                    int tmp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = tmp;
                }
            }
        }

        System.out.print("Результат после сортировки по возрастанию: ");
        for(int i = 0; i < mas.length ; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
