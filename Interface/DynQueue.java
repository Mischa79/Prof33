package Algorithms.lesson2.Interface;

//Динамическая очередь
//dynamische Warteschlange
public class DynQueue implements ICharQ {

    private char[] q;
    private int putLoc, getLoc;

    public DynQueue(int size) {
        q = new char[size];
        putLoc = getLoc = 0;
    }

    @Override
    public void put(char ch) {
        if (putLoc == q.length) {
            char[] t = new char[q.length * 2];
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];
            q = t;
        }
        q[putLoc++] = ch;

    }

    @Override
    public char get() {
        if (getLoc == putLoc) {
            System.out.println(" - Die Wartescnlange ist leer");
            return (char) 0;
        }
        return q[getLoc++];
    }
}

class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;
        char ch;
        int i;
        iQ = q1;

        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        System.out.print("Inhalt Die feste Warteschlange: ");  //Coдepжимoe фиксированной очереди
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
        for (i = 0; i < 10; i++)
            iQ.put((char) ('Z' - i));

        System.out.println("Inhalt Die dynamische Warteschlange: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        System.out.println("Inhalt Ringwarteschlange : ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        for (i = 0; i < 20; i++)
            iQ.put((char) ('A' + i));

        System.out.println("Inhalt Ringwarteschlange: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();

            System.out.print(ch);
        }
        System.out.println("\nKonservierung und Datenverbrauch" + "Ringwarteschlange");   //Coxpaнeниe и   использование данных
        for (i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
    }

}
