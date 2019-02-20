/*Задача №15: Сортировка данных в массиве Задание
Необходимо написать программу для сортировки данных массива по возрастанию.
Использовать пузырьковый метод сортировки.
 */

public class Task15 {
    public static void main(String[] args) {
        int arr[] = {1, 5, 12, 15, 8, 212, 35, 3, 2, 56, 124, 0};

        for(int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = arr.length-1 ; i > 0 ; i--) {
            for(int j = 0 ; j < i ; j++) {
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        for(int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
