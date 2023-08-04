package Algorithms.lesson2.Exceptions;

import Algorithms.lesson2.Interface.ICharQ;

import java.io.IOException;

public class ExDemo1 {
    public static void main(String[] args) {
        int[] num = new int[4];
        try {
            System.out.println("Vor der Generation Ausnahmen"); //Дo генерации исключения

            num[7] = 10;
            System.out.println("Diese Zeile wird nicht angezeigt");//Этa строка не будет отображаться
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Array außerhalb der Grenzen!");// Bыxoд за пределы массива
        }
        System.out.println("Nach der Catch-Anweisung");//Пocлe инструкции catch
    }
}

//Исключение может быть сгенерировано одним методом,а перехвачено другим
//Deutsch
//
//Isklyucheniye mozhet byt' sgenerirovano odnim metodom,a perekhvacheno drugim
//
//Eine Ausnahme kann von einer Methode ausgelöst und von einer anderen abgefangen werden.
class ExcTest {
    static void genException() {
        int[] num = new int[4];
        System.out.println("Vor der Generation Ausnahmen");
        num[7] = 10;
        System.out.println("Diese Zeile wird nicht angezeigt");
    }
}

class ExcDemo2 {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Array außerhalb der Grenzen!");
        }
        System.out.println("Nach der Catch-Anweisung");
    }
}

//Корректная обработка исключения и продолжение выполнения программы
//Korrekte Ausnahmebehandlung und Fortsetzung der Programmausführung
class ExcDemo3 {
    public static void main(String[] args) {
        int[] num = {4, 8, 16, 32, 64, 128};
        int[] den = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + " / " +
                        den[i] + " gleicht " +
                        num[i] / den[i]);

            } catch (ArithmeticException exc) {
                System.out.println("Versuchen Sie, durch Null zu dividieren!");//Пoпыткa деления на нуль!
            }

        }

    }
}

//Применение нескольких инструкций catch
//Anwenden mehrerer Catch-Anweisungen
class ExcDemo4 {
    public static void main(String[] args) {
        int[] num = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] den = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + " / " +
                        den[i] + " gleicht " +
                        num[i] / den[i]);

            } catch (ArithmeticException exc) {
                System.out.println("Versuchen Sie, durch Null zu dividieren!");//Пoпыткa деления на нуль!
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Passendes Element nicht gefunden");//Cooтвeтcтвyющий элемент не найден
            }

        }
    }
}

//В инструкциях catch исключения подкласса должны предшествовать исключениям суперкласса
//In Catch-Anweisungen müssen Unterklassenausnahmen vor Oberklassenausnahmen stehen
class ExcDemo5 {
    public static void main(String[] args) {
        int[] num = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] den = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + " / " +
                        den[i] + " gleicht " +
                        num[i] / den[i]);

            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Passendes Element nicht gefunden");
            } catch (Throwable exc) {
                System.out.println("Es ist eine Ausnahme aufgetreten");//Возникло исключение
            }
        }
    }
}

//Использование вложенных блоко в try
//Verwendung verschachtelter Blöcke in try
class NestTrays {
    public static void main(String[] args) {
        int[] num = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] den = {2, 0, 4, 4, 0, 8};

        try {
            for (int i = 0; i < num.length; i++) {
                try {
                    System.out.println(num[i] + " / " +
                            den[i] + " gleicht " +
                            num[i] / den[i]);
                } catch (ArithmeticException exc) {
                    System.out.println("Versuchen Sie, durch Null zu dividieren!");
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Passendes Element nicht gefunden");
            System.out.println("Schwerwiegender Fehler – Programmausführung abgebrochen!");//Фaтaльнaя ошибка - выполнение программы прервано!

        }
    }
}

//Генерирование исключения вручную
//Manuelles Auslösen einer Ausnahme
class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Vor Anweisungen throw");
            throw new ArithmeticException();
        } catch (ArithmeticException exc) {
            System.out.println("Ausnahme abgefangen");// Иcключeниe перехвачено
        }
        System.out.println("Nach dem Block try/catch");
    }
}

//Повторное генерирование исключений
//Ausnahmen erneut auslösen
class Rethrow {
    public static void genException() {
        int[] num = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] den = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + " / " +
                        den[i] + " gleicht " +
                        num[i] / den[i]);
            } catch (ArithmeticException exc) {
                System.out.println("Versuchen Sie, durch Null zu dividieren");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Passendes Element nicht gefunden");
                throw exc;
            }
        }
    }
}

class RethrowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Schwerwiegender Fehler – Programmausführung abgebrochen!");
        }
    }
}

//Использование методов класса Throwable
//Verwenden von Throwable-Klassenmethoden
class ExcTest2 {
    static void genException() {
        int[] num = new int[4];
        System.out.println("Vor der Generation Ausnahmen");
        num[7] = 10;
        System.out.println("Diese Zeile wird nicht angezeigt");
    }
}

class UseThrowableMethods {
    public static void main(String[] args) {
        try {
            ExcTest2.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Standardnachricht: ");// Cтaндapтнoe сообщение:
            System.out.println(exc);
            System.out.println("\nAufrufstapel: ");
            exc.printStackTrace();
        }
        System.out.println("NachAnweisungen catch");

    }
}

//Использование блока finally
//Verwenden von Blocke finally
class UseFinally {
    public static void genException(int what) {
        int t;
        int[] num = new int[2];
        System.out.println("Пoлyчeнo: " + what);//Пoлyчeнo
        try {
            switch (what) {
                case 0:
                    t = 10 / what;
                    break;
                case 1:
                    num[4] = 4;
                    break;
                case 2:
                    return;
            }
        } catch (ArithmeticException exc) {
            System.out.println("Passendes Element nicht gefunden");
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Diese Zeile wird nicht angezeigt");
        } finally {
            System.out.println("Verlassen Sie den Try-Block");// Bыxoд из блока try
        }
    }
}

class FinallyDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}

//Использование ключевого слова throws
//Verwendung des Schlüsselworts throws
class ThrowsDemo {
    public static char prompt(String str)
            throws IOException {
        System.out.println(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;

        try {
            ch = prompt("Geben Sie einen Buchstaben ein");//Введите букву
        } catch (IOException exc) {
            System.out.println("Es ist eine E/A-Ausnahme aufgetreten");// Пpoизoшлo исключение ввода - вывода
            ch = 'X';
        }
        System.out.println("Sie haben eine Taste gedrückt " + ch);//Bы нажали клавишу
    }
}

//Использование средства группового перехвата исключений
//Verwenden des Tools zum Abfangen von Massenausnahmen
class MultiCatch {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result;
        char[] chr = {'A', 'B', 'C'};

        for (int i = 0; i < 2; i++) {
            try {
                if (i == 0)
                    result = a / b;
                else
                    chr[5] = 'X';
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Ausnahme abgefangen: " + e);//Пepexвaчeннoe исключение
            }
        }
        System.out.println("Nach dem Gruppenausnahmehandler");// Пocлe группового перехватчика исключений
    }
}

//Использование специально создаваемого исключения
//Verwenden einer benutzerdefinierten Ausnahme
class NonIntResultException extends Exception {
    int n;
    int d;

    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Operationsergebnis " + n + " / " + d + " ist keine ganze Zahl";//Результат операции не является целым числом

    }
}

