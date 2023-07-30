package Algorithms.lesson2.Cycles;

import java.io.IOException;

public class WhileDemo {
    public static void main(String[] args) {
        char ch;
        //вывод букв используя цикл while ** Drucken von Buchstaben mithilfe einer While-Schleife
        ch = 'a';
        while (ch <= 'z') {
            System.out.println(ch);
            ch++;
        }
    }
}

//вычесление целых степеней числа ** Berechnung ganzzahliger Potenzen einer Zahl
class Power {
    public static void main(String[] args) {
        int e;
        int result;
        for (int i = 0; i < 10; i++) {
            result = 1;
            e = i;
            while (e > 0) {
                result *= 2;
                e--;
            }
            System.out.println("2 Bis zum Abschluss " + i + " gleichtgleicht " + result);//В степени
        }
    }
}

// Демонстрация использования цикла do - while ** Demonstration der Verwendung der do-while-Zyklus
class DWDemo {
    public static void main(String[] args) throws IOException {
        char ch;
        do {
            System.out.println("Drücken Sie die gewünschte Taste und dann die ENTER-Taste");//Haжмитe нужную клавишу, азатем клавишу ENTER
            ch = (char) System.in.read();//чтение символа с клавиатуры ** Lesen eines Zeichens von der Tastatur
        }while (ch != 'q');

    }
}


