import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int x = 7;
        int y = 2;
        int z = 4;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int T = in.nextInt();

        if(T == x || T == y || T == z) {
            System.out.println("Данное значение имеется в константах");
        }
        else {
            System.out.println("Такой константы нет!");
        }
    }
}
