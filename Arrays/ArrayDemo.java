package Algorithms.lesson2.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] sample = new int[10];
        int i;

        for (i = 0; i < 10; i = i + 1)
            sample[i] = i;
        for (i = 0; i < 0; i = i + 1)
            System.out.println("Element[" + i + "]: " + sample[i]);
    }
}
// поиск минимального и максималльного значений в массиве
//Finden der minimalen und maximalen Werte in einem Array
class MinMax {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int min, max;
        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;

        min = max = nums[0];
        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("min und max: " + min + " " + max);

    }
}
//применение инициализаторов массива
//Verwendung von Array-Initialisierern
class MinMax2 {
    public static void main(String[] args) {
        int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int min, max;
        min = max = nums[0];
        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("min und max: " + min + " " + max);
    }
}
//демонстрация алгоритма пузырьковой сортировки
//Demonstration des Blasensortierungsalgorithmus
class Bubble {
    public static void main(String[] args) {
        int[] num = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        int a, b, t;
        int size;

        size = 10;
        System.out.println("Quellarray:");//Иcxoдный массив
        for (int i = 0; i < size; i++)
            System.out.print(" " + num[i]);
        System.out.println();
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (num[b - 1] > num[b]) {
                    t = num[b - 1];
                    num[b - 1] = num[b];
                    num[b] = t;
                }
            }
        System.out.println("Kopiertes Array:");//Oтcopтиpoвaнный массив
        for (int i = 0; i < size; i++)
            System.out.print(" " + num[i]);
        System.out.println();
    }
}
//использование двумерного массива
//unter Verwendung eines zweidimensionalen Arrays
class TwoD {
    public static void main(String[] args) {
        int t, i;
        int[][] table = new int[3][4];
        for (t = 0; t < 3; ++t) {
            for (i = 0; i < 4; ++i) {
                table[t][i] = (t * 4) + i + 1;
                System.out.print(table[t][i] + " ");
            }
            System.out.println();
        }
    }
}
//выделение памяти по второму индексу массива в ручную
//Manuelle Zuweisung von Speicher am zweiten Index des Arrays

class Ragged {
    public static void main(String[] args) {
        int[][] riders = new int[7][];
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];

        int i, j;
        for (i = 0; i < 5; i++)
            for (j = 0; j < 10; j++)
                riders[i][j] = i + j + 10;
        for (i = 5; i < 7; i++)
            for (j = 0; j < 2; j++)
                riders[i][j] = i + j + 10;
        System.out.println("Anzahl der beförderten Passagiere  bei jedem Flug, wochentags:");
        //Koличecтвo пассажиров, перевезенных  каждым рейсом,
        // каждым рейсом, в будние днинедели

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        System.out.println("Anzahl der beförderten Passagiere  bei jedem Flug, an Wochenenden:");//....в выходные дни

        for (i = 5; i < 7; i++) {
            for (j = 0; j < 2; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
    }
}
//инициализация двумерного массива
//Initialisierung eines zweidimensionalen Arrays
class Squares{
    public static void main(String[] args) {
        int [][] sqr ={
                {1,1},
                {2,4},
                {3,9},
                {4,16},
                {5,25},
                {6,36},
                {7,49},
                {8,64},
                {9,81},
                {10,100}
        };
        int i,j;

        for (i=0; i<10; i++){
            for (j=0; j<2; j++)
                System.out.println(sqr[i][j] + " ");
            System.out.println();
        }
    }
}
//присваевание ссылок на массивы
//Zuweisen von Referenzen zu Arrays
class AssignARef{
    public static void main(String[] args) {
        int i;

        int[] num1 = new int[10];
        int[] num2 = new int[10];

        for (i=0; i<10; i++)
            num1[i] = i;
        for (i=0; i<10; i++)
            num2[i]= -i;
        System.out.print("Arrays num1: ");
        for (i=0; i<10; i++)
            System.out.print(num1[i] + " ");
        System.out.println();

        System.out.print("Arrays num2: ");
        for (i=0; i<10; i++)
            System.out.print(num2[i] + " ");
        System.out.println();

        num2 = num1;
        System.out.print("Arrays num2 nach dem Abtretung: ");//приссваивание
        for (i=0; i<10; i++)
            System.out.print(num2[i] + " ");
        System.out.println();

        num2[3] = 99;
        System.out.println("Arrays num1 nach der Änderung durch num2: ");//После изменения
        for (i=0; i<10; i++)
            System.out.print(num1[i] + " ");
        System.out.println();


    }
}
//Демонстрация использования переменной экземпляра length
//Demonstration der Verwendung einer Instanzvariablen length
class LengthDemo{
    public static void main(String[] args) {
        int[] list = new int[10];
        int[] num = {1, 2, 3};
        int[][] table = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        System.out.println("Größe list: " + list.length);
        System.out.println("Größe num: " + num.length);
        System.out.println("Größe table: " + table.length);

        System.out.println("Größe table[0]: " + table[0].length);
        System.out.println("Größe table[1]: " + table[1].length);
        System.out.println("Größe table[2]: " + table[2].length);
        System.out.println();

        for (int i = 0; i < list.length; i++)
            list[i] = i * i;
        System.out.println("Inhalt auflisten: ");// Coдepжимoe списка
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}
//для копирования массивов
//um Arrays zu kopieren
//class ArrayCopy{
//    public static void main(String[] args) {
//        int i;
//        int[]num1 = new int[10];
//        int[]num2 = new int[10];
//
//        for ( i = 0; i < num1.length; i++);
//        num1[i] = i;
//
//        if (num2.length >= num1.length)
//            for (i = 0; i < num2.length; i++)
//                num2[i] = num1[i];
//
//        for (i = 0; i < num2.length; i++)
//            System.out.println(num2[i] + " ");
//        System.out.println();
//
//    }
//}
