package Algorithms.lesson2.Cycles;

public class Guess {
    public static void main(String[] args) throws java.io.IOException {
        char ch, ignore, answer = 'K';
        do {
            System.out.println("Ein Brief aus dem Sortiment wird konzipiert A-Z.");//Задумана буква из диапазона

            System.out.println("Versuchen zu erraten: ");//Попытайтесь угадать

            ch = (char) System.in.read();//Чтение символа с клавиатуры ** Ein Zeichen von der Tastatur lesen
//Отбрасывание всех остальных символов во входном буфере ** Alle anderen Zeichen im Eingabepuffer werden verworfen
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) System.out.println("**Rechts**");//Правильно
            else {
                System.out.println("...Entschuldigung, der erforderliche Buchstabe wurde gefunden");//Извините, нужная буква находится
                if (ch < answer) System.out.println("gegen Ende des Alphabets");//ближе к концу алфавита
                else System.out.println("näher am Anfang des Alphabets");//ближе к началу алфавита
                System.out.println("Bitte versuche es erneut!\n");//Пoвтopитe попытку!

            }
        }while (answer != ch);


    }
}
