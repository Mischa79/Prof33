package Algorithms.lesson2.Cycles;

import java.io.IOException;

public class Help {
    public static void main(String[] args) throws IOException {
        char choice;
        System.out.println("Referenz:");//справка
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println("wählen: ");//выберите
        choice = (char) System.in.read();
        System.out.println("\n");
        switch (choice) {
            case '1':
                System.out.println("Anweisung if:\n");//Инструкция
                System.out.println("if(Zustand) Anweisung;");//условие
                System.out.println("else Anweisung");
                break;
            case '2':
                System.out.println("Anweisung switch:\n");
                System.out.println("switch(Zustand) {");
                System.out.println(" case Konstante: ");//константа
                System.out.println(" Reihenfolge der Anweisungen");//последовательность инструкций
                System.out.println(" break;");
                System.out.println(" //...");
                break;
            default:
                System.out.println("Anfrage nicht gefunden.");//Запрос не найден
        }

    }
}
class Help2{
    public static void main(String[] args)throws IOException{
        char choice, ignore;
        do {
            System.out.println("Referenz:");//справка
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println("wählen: ");//выберите

            choice = (char) System.in.read();
            do {
                ignore =(char) System.in.read();
            }while (ignore != '\n');
        }while (choice < '1' | choice > '5');
        System.out.println("\n");
        switch (choice){
            case '1':
                System.out.println("Anweisung if:\n");//Инструкция
                System.out.println("if(Zustand) Anweisung;");//условие
                System.out.println("else Anweisung");
                break;
            case '2':
                System.out.println("Anweisung switch:\n");
                System.out.println("switch(Zustand) {");
                System.out.println(" case Konstante: ");//константа
                System.out.println(" Reihenfolge der Anweisungen");//последовательность инструкций
                System.out.println(" break;");
                System.out.println(" //...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Zyklus for:\n");
                System.out.println("for(Initialisierung; Zustand; Wiederholung)");//инициaлизaция; условие; итерация
                System.out.println("Anweisung");
                break;
            case '4':
                System.out.println("Zyklus while:\n");
                System.out.println("while (Zustand) Anweisung;");
                break;
            case '5':
                System.out.println("Zyklus do-while:\n");
                System.out.println("do {");
                System.out.println(" Anweisung;");
                System.out.println("} while (Zustand);");
                break;


        }

    }

}
class Help3{
    void helPon(int what){
        switch (what){
            case '1':
                System.out.println("Anweisung if:\n");//Инструкция
                System.out.println("if(Zustand) Anweisung;");//условие
                System.out.println("else Anweisung");
                break;
            case '2':
                System.out.println("Anweisung switch:\n");
                System.out.println("switch(Zustand) {");
                System.out.println(" case Konstante: ");//константа
                System.out.println(" Reihenfolge der Anweisungen");//последовательность инструкций
                System.out.println(" break;");
                System.out.println(" //...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Zyklus for:\n");
                System.out.println("for(Initialisierung; Zustand; Wiederholung)");//инициaлизaция; условие; итерация
                System.out.println("Anweisung");
                break;
            case '4':
                System.out.println("Zyklus while:\n");
                System.out.println("while (Zustand) Anweisung;");
                break;
            case '5':
                System.out.println("Zyklus do-while:\n");
                System.out.println("do {");
                System.out.println(" Anweisung;");
                System.out.println("} while (Zustand);");
                break;
            case '6':
                System.out.println("Anweisung break:\n");
                System.out.println("break; oder break Etikett;");//метка
                break;
            case '7':
                System.out.println("Anweisung continue:\n");
                System.out.println("Continue; oder continue Etikett;");
                break;
        }
        System.out.println();
    }
    void showMenu(){
        System.out.println("Referenz:");//справка
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue\n");
        System.out.println("wählen (q - Ausfahrt): ");
    }
    boolean isValid(int ch){
        return !(ch < '1' | ch > '7' & ch != 'q');
    }
}
class HelpClassDemo{
    public static void main(String[] args) throws IOException {
        char choice, ignore;
        Help3 hlopez = new Help3();
        for (;;){
            do {
                hlopez.showMenu();
                choice = (char) System.in.read();
                do {
                    ignore =(char)  System.in.read();
                }while (ignore != '\n');
            }while (!hlopez.isValid(choice));
            if (choice =='q')break;
            System.out.println('\n');
            hlopez.helPon(choice);
        }

    }
}

//вывод квадратных корней чисел от 1 до 99 ** Ausgabe von Quadratwurzeln aus Zahlen von 1 bis 99
//вместе с ошибкой округления ** zusammen mit Rundungsfehler
class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;
        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Quadratwurzel von " + num + " gleicht " + sroot);//корень квадратный из
            //вычисление ошибки округления ** Rundungsfehlerberechnung
            rerr = num - (sroot * sroot);
            System.out.println("Rundungsfehler: " + rerr);//ошибка округления
            System.out.println();
        }
    }
}

//цикл for, выполняющийся с отрицательным приращением переменной ** for-Schleife, die mit einem negativen Inkrement einer Variablen ausgeführt wird
class DecrFor {
    public static void main(String[] args) {
        int x;
        for (x = 100; x > -100; x -= 5)
            System.out.println(x);
    }
}

class Comma {
    public static void main(String[] args) {
        int i, j;
        for (i = 0, j = 10; i < j; i++, j--)
            System.out.println("i und j: " + i + " " + j);
    }
}

class ForTest {
    public static void main(String[] args) throws IOException {
        int i;
        System.out.println("Drücken Sie S, um anzuhalten");//для остановки нажмите клавишу S
        for (i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Passieren #" + i);//проход

    }
}

