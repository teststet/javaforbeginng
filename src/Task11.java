/*Задача №11: Ввод строки с клавиатуры Задание
Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.
 */

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        System.out.print("Результат: " + str);
    }
}
