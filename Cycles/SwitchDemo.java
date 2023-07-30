package Algorithms.lesson2.Cycles;

public class SwitchDemo {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++)
            switch (i) {
                case 0:
                    System.out.println("i gleicht 0");//равно
                    break;
                case 1:
                    System.out.println("i gleicht 1");//равно
                    break;
                case 2:
                    System.out.println("i gleicht 2");//равно
                    break;
                case 3:
                    System.out.println("i gleicht 3");//равно
                    break;
                case 4:
                    System.out.println("i gleicht 4");//равно
                    break;
                default:
                    System.out.println("i gleicht oder größer 5");//равно или больше

            }
    }
}
//инструкция switch без break ** switch-Anweisung ohne break
class NoBreak{
    public static void main(String[] args) {
        int i;
        for (i=0; i<=5; i++){
            switch (i){
                case 0:
                    System.out.println("i Weniger 1");//Меньше
                case 1:
                    System.out.println("i Weniger 2");
                case 2:
                    System.out.println("i Weniger 3");
                case 3:
                    System.out.println("i Weniger 4");
                case 4:
                    System.out.println("i Weniger 5");
            }
            System.out.println();
        }

    }
}
class BreakDemo{
    public static void main(String[] args) {
        int num;
        num = 100;
//Выполнение цикла до тех пор, пока квадрат значения
// переменной i меньше значения переменной num
//Schleife bis zum Quadrat des Wertes
// Variable i ist kleiner als der Wert der Variablen num
        for (int i = 0; i < num; i++){
            if (i*i >= num) break;//прекращение выполнения цикла ** Beendigung der Zyklus
            System.out.print(i + " ");
        }
        System.out.println("Zyklus beenden.");
    }
}
