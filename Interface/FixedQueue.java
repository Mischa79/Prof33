package Algorithms.lesson2.Interface;
//класс реализующий очередь фиксированного размера
//eine Klasse, die eine Warteschlange mit fester Größe implementiert

public class FixedQueue implements ICharQ{

    private final char []q;
    private int putLoc, getLoc;

    public FixedQueue(int size){
        q = new char[size];
        putLoc = getLoc = 0;
    }

    @Override
    public void put(char ch) {
        if (putLoc == q.length){
            System.out.println(" - Die Warteschlange ist voll ");//- Очередь заполнена
            return;
        }
        q[putLoc++] = ch;

    }
    @Override
    public char get() {
        if (getLoc == putLoc){
            System.out.println(" -Die Warteschlange ist leer");
            return (char) 0;
        }
        return q[getLoc++];
    }
}
