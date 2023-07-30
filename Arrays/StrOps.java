package Algorithms.lesson2.Arrays;

//Некоторые операции над строками

public class StrOps {
    public static void main(String[] args) {
        String str1 = "Java - лидер И н т е р н е т а !";
        String str2 = str1;
        String str3 = "Строки Java эффективны.";
        int result, idx;
        char ch;

        System.out.println("Bereit str1: " + str1.length());
        for (int i = 0; i < str1.length(); i++)
            System.out.print(str1.charAt(i));
        System.out.println();
        if (str1.equals(str2))
            System.out.println("str1 gleichwertig str2");//эквивалентнa
        else
            System.out.println("str nicht gleichwertig str2");
        if (str1.equals(str3))
            System.out.println("str1 gleichwertig str3");
        else
            System.out.println("str nicht gleichwertig str3");
        result = str1.compareTo(str3);
        if (result == 0)
            System.out.println("str1 und str3 gleich");
        else if (result < 0)
            System.out.println("str1 weniger str3");
        else
            System.out.println("str1 mehr str3");
        str2 = "Einz Zwei Drei Einz";
        idx = str2.indexOf("Einz");
        System.out.println("Erstvorkommensindex Einz: " + idx);// Индeкc первого вхождения
        idx = str2.lastIndexOf("Einz");
        System.out.println("Letzter Eintragsindex Einz: " + idx);
    }
}
    //Демонстрация использования массивов строк
    class StringArrays{
        public static void main(String[] args) {
            String[] str = {"Эта ","строка","является","тестом." };
            System.out.println(" Иcxoдный массив: ");
            for (String s:str)
                System.out.print(s + " ");
            System.out.println("\n");

            str[2] = " также является";
            str[3] = " тестом!";
            System.out.println("Измeнeнный массив: ");
            for (String s: str)
            System.out.print(s + "");
        }
    }
   //Применение метода sub string()
class SubString{
       public static void main(String[] args) {
           String orgStr = "Java - Motor Internet.";

           String subStr = orgStr.substring(7,22);

           System.out.println("orgStr: " + orgStr);
           System.out.println("subStr: " + subStr);
       }
   }
//Использование строк для управления инструкцией switch
class StringSwitch{
    public static void main(String[] args) {
        String command = "cancel";
        switch (command){
            case "connect":
                System.out.println("Verbindung");
                break;
            case "cancel":
                System.out.println("Stornieren");
                break;
            case "disconnect":
                System.out.println("Abschalten");
                break;
            default:
                System.out.println("Falsch!");
                break;
        }
    }
}
//Простейший автоматизированный телефонный справочник
class Phone{
    public static void main(String[] args) {
        String[][] numbers = {
                { "Tom", "555-3322"},
                {"Jerry", "555-8976"},
                {"Toto", "555-1037"},
                {"Bok", "555-1400"}
        };
        int i;
        if (args.length != 1)
            System.out.println("Verwenden: java Phone <Name>");//Иcпoльзoвaниe
        else {
            for (i = 0; i < numbers.length; i++){
                if (numbers[i][0].equals(args[0])){
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
            }
            if (i == numbers.length)
                System.out.println("Name nicht gefunden.");
        }
    }
}
//Преобразование строчных букв англ алф в прописные
class UpCase{
    public static void main(String[] args) {
        char ch;
        for (int i = 0; i <10; i++){
            ch = (char) ('a' + i);
            System.out.print(ch);

            ch = (char) ((int) ch & 65503);
            System.out.print(ch + " ");
        }
    }
}
//Преобразование прописных букв в строчные
class LowCase{
    public static void main(String[] args) {
        char ch;
        for (int i = 0; i <10; i++){
            ch = (char) ('A' + i);
            System.out.print(ch);

            ch = (char) ((int) ch | 32);
            System.out.print(ch + " ");
        }
    }
}
//отрожение битов, составляющих байт
class ShowBits{
    public static void main(String[] args) {
        int t;
        byte val;
        val = 123;
        for (t = 128; t>0; t =t/2){
            if ((val & t) !=0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
//Использование побитовой операции исключающего ИЛИ
//для шифрования и дешифрования сообщений
class Encode{
    public static void main(String[] args) {
        String msg = "Es ist nur ein Test";
        String encmsg = "";
        String decmsg ="";
        int key = 88;
        System.out.println("Originale Nachricht: ");//Иcxoднoe сообщение
        System.out.println(msg);

        for (int i =0; i<msg.length();i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.println("Verschlüsselte Nachricht: ");//Зaшифpoвaннoe сообщение
        System.out.println(encmsg);

        for (int i =0; i<msg.length();i++)
        decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.println("Entschlüsselt Nachricht: ");  //Дешифрованное  сообщение
        System.out.println(decmsg);
    }
}

