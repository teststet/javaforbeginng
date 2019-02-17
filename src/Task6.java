import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число x: ");
        int x = in.nextInt();
        in = new Scanner(System.in);
        System.out.print("Введите число y: ");
        int y = in.nextInt();
        in = new Scanner(System.in);
        System.out.print("Введите число z: ");
        int z = in.nextInt();

        int sa = (x+y+z)/3;
        System.out.println("Среднее арифметическое чисел x,y,z = " + sa);

        if(sa > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
