/*Задача №13: Сравнение двух строк Задание
Необходимо провести сравнение длинны двух строк,
которые были введены с клавиатуры и записаны в соответствующие переменные.
Вывести на экран строку с наибольшей длинной.

 */

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.print("Введите первую строку: ");
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();

        System.out.print("Введите вторую строку: ");
        in = new Scanner(System.in);
        String str2 = in.nextLine();

        System.out.println("Вывод на экран строки с наибольшей длинной");

        if(str2.length() > str1.length()) {
            System.out.println(str2);
        }
        else if(str2.length() == str1.length()){
            System.out.println("Длина строк равна");
        }
        else {
            System.out.println(str1);
        }
    }
}
