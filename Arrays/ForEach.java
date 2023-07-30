package Algorithms.lesson2.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : num) {
            System.out.println("Bedeutung: " + x);//Знaчeниe
            sum += x;
            // if (x == 5)break;//прерывание цикла по достижении значения 5 ** Unterbrechen der Zyclus, wenn der Wert erreicht ist 5
        }
        System.out.println("Betrag: " + sum);
    }
}

//Использование расширенного цикла for
// для обработки двумерного массива
class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] num = new int[3][5];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                num[i][j] = (i + 1) * (j + 1);

        for (int[] x : num) {
            for (int y : x) {
                System.out.println("Bedeutung: " + y);
                sum += y;
            }
        }
        System.out.println("Betrag: " + sum);
    }
}

//Поиск вмассиве с использованием расширенного цикла for
class Search {
    public static void main(String[] args) {
        int[] num = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        for (int x : num) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Wert gefunden! " + val);//Знaчeниe найдено
    }
}
