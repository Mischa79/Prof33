package Algorithms.lesson2.Arrays;
//Класс , реализующий очередь для хранения символов
//Eine Klasse, die eine Warteschlange zum Speichern von Zeichen implementiert
public class Queue {
    char[]q;
    int putLoc, getLoc;

    Queue(int size){
        q = new char[size];
        putLoc = getLoc = 0;
    }
    void put(char ch){
        if (putLoc == q.length){
            System.out.println(" - Die Warteschlange ist voll");//Очередь заполнена
            return;
        }
        q[putLoc++] = ch;
    }
    char get(){
        if (getLoc == putLoc){
            System.out.println(" - Die Warteschlange ist leer");//Очередь пуста
            return (char) 0;
        }
        return q[getLoc++];
    }
}
//демонстрация использования класса Queue
//Demonstration der Klassennutzung Queue
class QDemo{
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;
        System.out.print("Verwenden einer Warteschlange bigQ Erhaltung des Alphabets");//Иcпoльзoвaниe очереди bigQ  для  сохранения алфавита
        for (i =0; i<26; i++)
            bigQ.put((char) ('A' + i));
        System.out.print("Warteschlangeninhalt bigQ: ");// Coдepжимoe очереди
        for (i =0; i<26; i++){
            ch = bigQ.get();
            if (ch != (char) 0) System.out.println(ch);
        }
        System.out.print("\n");
        System.out.print("Verwenden einer Warteschlange smallQ Fehler zu erzeugen");  //Иcпoльзoвaниe очереди smallQ для генерации ошибок
        for (i =0; i<5; i++){
            System.out.print("Versuch speichern " + (char) ('Z' - i));//Попытка сохранения
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();
        System.out.print("Warteschlangeninhalt smallQ: ");
        for (i =0; i<5; i++){
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }


    }
}
