package Algorithms.lesson2.Cycles;

public class Ladder {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 6; x++){
            if (x==1)
                System.out.println("x gleicht 1");//равно
            else if (x==2)
                System.out.println("x gleicht 2");//равно
            else if (x==3)
                System.out.println("x gleicht 3");//равно
            else if (x==4)
                System.out.println("x gleicht 4");//равно
            else
                //условие выполняемое по умолчанию ** Standardzustand
                System.out.println("Der x-Wert liegt außerhalb des Bereichs 1–4");//значение x находится вне диапазона 1-4
        }
    }
}
