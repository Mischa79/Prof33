package Algorithms.lesson2.IO;

//Чтение байтов с клавиатуры в массив
//Bytes von der Tastatur in ein Array lesen

import java.io.*;


public class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];
        System.out.println("Geben Sie Zeichen ein.");//Введите символы.
        System.in.read(data);
        System.out.println("Sie sind eingetreten: ");//Вы ввели
        for (int i = 0; i < data.length; i++)
            System.out.print((char) data[i]);

    }
}

//Отображение текстового файла
//Anzeige von Textdateien
class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        if (args.length != 1) {
            System.out.println("Verwendung: ShowFile name_file.txt");//Использование:
            return;

        }
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException exc) {
            System.out.println("die File nicht gefunden");
            return;
        }
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != 1);
        } catch (IOException exc) {
            System.out.println("Fehler beim Lesen der File");
        } finally {
            try {
                fin.close();
            } catch (IOException exc) {
                System.out.println("Fehler beim Schließen der File");
            }

        }

    }
}

//Копирование текстового файла
//Kopieren einer Textdatei
class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if (args.length != 2) {
            System.out.println("Verwendung: CopyFile - Quelle und Ziel ");//источник и назначени
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("E/A-Fehler: " + exc);//Ошибка ввода-выводa
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Fehler beim Schließen der Eingabedatei");//шибка при закрытии входного файлa

            }
            try {
                if (fout != null) fout.close();
            } catch (IOException exc) {
                System.out.println("Fehler beim Schließen der Ausgabedatei");
            }
        }

    }
}

// для автоматического закрытия файла, когда в немб ольше нет необходимости
//um die Datei automatisch zu schließen, wenn sie nicht mehr benötigt wird
class showFile {
    public static void main(String[] args) {
        int i;
        if (args.length != 1) {
            System.out.println("Verwendung: showFile name_file.txt");
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("E/A-Fehler: " + exc);
        }
    }
}

//yправление двумя ресурсами (в данном случае — файлами) с помощью единственной инструкции try
//zwei Ressourcen (in diesem Fall Dateien) mit einer einzigen try-Anweisung verwalten
class copyFile {
    public static void main(String[] args) {
        int i;
        if (args.length != 2) {
            System.out.println("Verwendung: CopyFile - Quelle und Ziel ");
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1])) {
            do {
                i = fin.read();
                if (i != -1) fout.write(i);

            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("E/A-Fehler: " + exc);
        }

    }
}
//Запись и чтение двоичных данных
//Schreiben und Lesen von Binärdaten
class RWData{
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        try(DataOutputStream dataOutput = new DataOutputStream(new FileOutputStream("testData"))) {
            System.out.println("Aufscnreiben: " + i);
            dataOutput.writeInt(i);

            System.out.println("Aufscnreiben: " + d);
            dataOutput.writeDouble(d);

            System.out.println("Aufscnreiben: " + b);
            dataOutput.writeBoolean(b);

            System.out.println("Aufscnreiben: " + 12.2 * 7.4);
            dataOutput.writeDouble(12.2 * 7.4);

        }
        catch (IOException exc){
            System.out.println("Fehler beim Aufscnreibenfile");
            return;
        }
        System.out.println();
        try(DataInputStream dataInput = new DataInputStream(new FileInputStream("testData"))) {
            i = dataInput.readInt();
            System.out.println("gelesen: " + i);

            d = dataInput.readDouble();
            System.out.println("gelesen: " + d);

            b = dataInput.readBoolean();
            System.out.println("gelesen: " + b);

        }
        catch (IOException exc){
            System.out.println("Fehler beim Lesen");
        }
    }
}