package Algorithms.lesson2.QuickSort;

//Простая версия класса QuickSort, реализующего быструю сортировку
//Eine einfache Version der QuickSort-Klasse, die Quicksort implementiert

public class QuickSort {
    //вызов фактического метода быстрой сортировки
    //Aufruf der eigentlichen Quicksort-Methode
   static void qSort(char[] items){
       qs(items,0,items.length-1);

    }
   //Рекурсивная версия метода быстрой сортировки символов
   //Rekursive Version der Zeichen-Quicksort-Methode
    private static void qs(char[] items, int left, int right) {
       int i,j;
       char x,y;
       i= left;
       j= right;
       x = items[(left+right)/2];

       do {
           while ((items[i] < x) && (i<right)) i++;
           while ((x< items[j]) && (j>left)) j--;

           if (i <= j){
               y = items[i];
               items[i] = items[j];
               items[j] = y;
               i++;
               j--;
           }
       }while (i <= j);
       if (left<j) qs(items,left,j);
       if (i<right) qs(items,i,right);

    }
}
class QSDemo{
    public static void main(String[] args) {
        char[]a = {'d','x','a','r','p','j','i'};
        int i;

        System.out.println("Quellarray: ");//Исходный массив
        for (i =0; i<a.length; i++)
            System.out.print(a[i]);
        System.out.println();

        //сортировка массива
        //Array-Sortierung

        QuickSort.qSort(a);

        System.out.println("sortiertes Array: ");//отсортированный масив
        for (i =0; i<a.length; i++)
            System.out.print(a[i]);
    }
}
