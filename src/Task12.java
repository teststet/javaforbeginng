/*Задача №12: Удаление всех пробелов в заданном тексте Задание
Для введенной с клавиатуры строки необходимо провести отсев пробелов.
Результат в виде строки без пробелов вывести на экран.
 */

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        str = str.replaceAll(" ", "");
        System.out.print("Результат:" + str);
    }
}
