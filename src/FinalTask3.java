/*Итоговая задача №3 Задание
Напишите программу конвертер валют.
Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей.
 */
import java.util.Scanner;

public class FinalTask3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Конвертер перевода рублей в долары");

            System.out.print("Введите текущий курс рубля: ");
            Double kur = in.nextDouble();

            System.out.print("Введите количество рублей: ");
            Double rub = in.nextDouble();

            Double dol = kur * rub;
            System.out.println("Получилось " + dol + "$");
        }
}
