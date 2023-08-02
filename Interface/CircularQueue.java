package Algorithms.lesson2.Interface;
//Кольцевая очередь
//Ringwarteschlange
public class CircularQueue implements ICharQ{
    private final char []q;
    private int putLoc, getLoc;

    public CircularQueue(int size){
        q = new char[size + 1];
        putLoc = getLoc = 0;
    }

    @Override
    public void put(char ch) {
        if (putLoc + 1 == getLoc |
                (putLoc == q.length -1) & (getLoc == 0)){
            System.out.println(" - Die Warteschlange ist vool");
            return;
        }
        q[putLoc++] = ch;
        if (putLoc == q.length) putLoc = 0;
    }

    @Override
    public char get() {
        if (getLoc == putLoc){
            System.out.println(" -Die Warteschlange ist leer");
            return (char) 0;
        }
        char ch = q[getLoc++];
        if (getLoc == q.length) getLoc = 0;
        return q[getLoc];
    }
}
