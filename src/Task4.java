/* Задача №4: Отработка поразрядных операций Задание
Ввести с консоли число в бинарном формате. Перевести его в int и вывести на экран
*/
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        String bin = in.nextLine();
        System.out.println("Число в десятичном формате: " + Integer.parseInt(bin, 2));
    }
}
