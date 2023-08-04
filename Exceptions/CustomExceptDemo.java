package Algorithms.lesson2.Exceptions;

public class CustomExceptDemo {
    public static void main(String[] args) {
        int[] num = {4, 8, 15, 32, 64, 128, 256, 512};
        int[] den = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < num.length; i++) {
            try {
                if ((num[i] % 2) != 0)
                    throw new NonIntResultException(num[i], den[i]);
                System.out.println(num[i] + " / " +
                        den[i] + " gleicht " +
                        num[i] / den[i]);
            } catch (ArithmeticException exc) {
                System.out.println("Versuchen Sie, durch Null zu dividieren");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Passendes Element nicht gefunden");
            } catch (NonIntResultException exc) {
                System.out.println(exc);
            }
        }
    }

    public class QueueFullException extends Exception {
        int size;

        QueueFullException(int s) {
            size = s;
        }


        public String toString() {
            return "\nDie Warteschlange ist voll. Maximale Größe " + size;//Очередь заполнена. Максималь ный размер
        }
    }

    public class QueueEmptyException extends Exception {
        public String toString() {
            return "\nWarteschlange ist leer.";
        }
    }


    class FixedQueue implements ICharQ {
        private final char[] q;
        private int putLoc, getLoc;

        public FixedQueue(int size) {
            q = new char[size];
            putLoc = getLoc = 0;
        }

        @Override
        public void put(char ch) throws QueueFullException {
            if (putLoc == q.length)
                throw new QueueFullException(q.length);
            q[putLoc++] = ch;

        }

        @Override
        public char get() throws QueueEmptyException {
            if (putLoc == q.length)
                throw new QueueEmptyException();
            return q[getLoc++];
        }
    }


    class QExcDemo {
        public void main(String[] args) {
            FixedQueue q = new FixedQueue(10);
            char ch;
            int i;

            try {
                for (i = 0; i < 11; i++) {
                    System.out.println("Versuch speichern: " + (char) ('A' + i));// Пoпыткa сохранения
                    q.put((char) ('A' + i));
                    System.out.println(" - OK");
                }
                System.out.println();
            } catch (QueueFullException exc) {
                System.out.println(exc);
            }
            System.out.println();
            try {
                for (i = 0; i < 11; i++) {
                    System.out.println("Den nächsten Charakter bekommen: ");//Пoлyчeниe очередного символа
                    ch = q.get();
                    System.out.println();
                }
            } catch (QueueEmptyException exc) {
                System.out.println(exc);
            }
        }
    }

    public interface ICharQ {
        void put(char ch) throws QueueFullException;

        char get() throws QueueEmptyException;
    }
}
